const MAX_K: usize = 210;
const MAX_SN: usize = 100100;

type ModInt = mod_int::ModInt<usize>;
fn solve() {
    let s = std::io::stdin();
    let mut sc = Scanner { stdin: s.lock() };
    let n: usize = sc.read();
    let k: usize = sc.read();
    let mut cnts = vec![0; MAX_SN];
    let mut iter = 0;
    {
        let mut i = 1;
        while i <= n {
            let j = n / i;
            //less than root N
            if i <= j {
                cnts[iter] += 1;
                i += 1;
            } else {
                cnts[iter] += n / j - i + 1;
                i = n / j + 1;
            }
            iter += 1;
        }
    }
    let mut dp = vec![vec![ModInt::new(0); MAX_SN]; MAX_K];

    dp[0][0] = ModInt::new(1);
    for i in 0..k {
        let mut sdp = vec![ModInt::new(0); MAX_SN];

        for j in 0..iter + 1 {
            sdp[j + 1] = sdp[j] + dp[i][j];
        }
        for j in 0..iter {
            dp[i + 1][j] = ModInt::new(cnts[j] as usize) * sdp[iter - j];
        }
    }
    let mut result = ModInt::new(0);
    for j in 0..iter + 1 {
        result += dp[k][j];
    }

    println!("{}", result.0);
}

fn main() {
    std::thread::Builder::new()
        .stack_size(64 * 1024 * 1024) // 64MB
        .spawn(|| solve())
        .unwrap()
        .join()
        .unwrap();
}

pub mod mod_int {
    use std::ops::{Add, AddAssign, Mul, MulAssign, Sub, SubAssign};

    //we may need to change this value
    const MOD: i64 = 1e9 as i64 + 7;

    #[derive(Clone, Copy, Debug)]
    pub struct ModInt<T: Copy + Clone + Add + AddAssign + Mul + MulAssign + Sub + SubAssign>(pub T);

    #[warn(unused_macros)]
    macro_rules! mod_int_impl {
        ($($t:ty)*) => ($(
            impl Add<ModInt<$t>> for ModInt<$t> {
                type Output = ModInt<$t>;
                fn add(self, other: ModInt<$t>) -> ModInt<$t> {
                    self + other.0
                }
            }
            impl Add<$t> for ModInt<$t> {
                type Output = ModInt<$t>;
                fn add(self, rhs: $t) -> ModInt<$t> {
                    let mut tmp = rhs + self.0;
                    if tmp >= self::MOD as $t {
                        tmp = tmp - self::MOD as $t;
                    }
                    ModInt(tmp)
                }
            }
            impl Sub<ModInt<$t>> for ModInt<$t> {
                type Output = ModInt<$t>;
                fn sub(self, rhs: ModInt<$t>) -> ModInt<$t> {
                    self - rhs.0
                }
            }
            impl Sub<$t> for ModInt<$t> {
                type Output = ModInt<$t>;
                fn sub(self, rhs: $t) -> ModInt<$t> {
                    let rhs = if rhs >= self::MOD as $t { rhs % self::MOD as $t} else { rhs };
                    let value = if self.0 < rhs { self.0 + self::MOD as $t} else { self.0 };
                    ModInt(value - rhs)
                }
            }
            impl AddAssign<ModInt<$t>> for ModInt<$t> {
                fn add_assign(&mut self, rhs: ModInt<$t>) {
                    *self = *self + rhs;
                }
            }
            impl AddAssign<$t> for ModInt<$t> {
                fn add_assign(&mut self, rhs: $t) {
                    *self = *self + rhs;
                }
            }
            impl SubAssign<ModInt<$t>> for ModInt<$t> {
                fn sub_assign(&mut self, rhs: ModInt<$t>) {
                    *self = *self - rhs;
                }
            }

            impl SubAssign<$t> for ModInt<$t> {
                fn sub_assign(&mut self, rhs: $t) {
                    *self = *self - rhs;
                }
            }

            impl Mul<ModInt<$t>> for ModInt<$t> {
                type Output = ModInt<$t>;
                fn mul(self, rhs: ModInt<$t>) -> ModInt<$t> {
                    self * rhs.0
                }
            }
            impl Mul<$t> for ModInt<$t> {
                type Output = ModInt<$t>;
                fn mul(self, rhs: $t) -> ModInt<$t> {
                    ModInt(self.0 * rhs % self::MOD as $t)
                }
            }
            impl MulAssign<ModInt<$t>> for ModInt<$t> {
                fn mul_assign(&mut self, rhs: ModInt<$t>) {
                    *self = *self * rhs;
                }
            }

            impl MulAssign<$t> for ModInt<$t> {
                fn mul_assign(&mut self, rhs: $t) {
                    *self = *self * rhs;
                }
            }
            impl ModInt<$t> {
                pub fn new(x: $t) -> Self {
                    ModInt(x)
                }
                pub fn pow(self, e: usize) -> ModInt<$t> {
                    let mut result = ModInt::<$t>::new(1);
                    let mut cur = self;
                    let mut e = e;
                    while e > 0 {
                        if e & 1 == 1 {
                            result *= cur;
                        }
                        cur *= cur;
                        e >>= 1;
                    }
                    result
                }
            }
            )*)
    }
    mod_int_impl!(usize i32 i64 u32 u64);
}

//snippet from kenkoooo
pub struct Scanner<R> {
    stdin: R,
}

impl<R: std::io::Read> Scanner<R> {
    pub fn read<T: std::str::FromStr>(&mut self) -> T {
        use std::io::Read;
        let buf = self
            .stdin
            .by_ref()
            .bytes()
            .map(|b| b.unwrap())
            .skip_while(|&b| b == b' ' || b == b'\n' || b == b'\r')
            .take_while(|&b| b != b' ' && b != b'\n' && b != b'\r')
            .collect::<Vec<_>>();
        unsafe { std::str::from_utf8_unchecked(&buf) }
            .parse()
            .ok()
            .expect("Parse error.")
    }
    pub fn read_line(&mut self) -> String {
        use std::io::Read;
        let buf = self
            .stdin
            .by_ref()
            .bytes()
            .map(|b| b.unwrap())
            .skip_while(|&b| b == b'\n' || b == b'\r')
            .take_while(|&b| b != b'\n' && b != b'\r')
            .collect::<Vec<_>>();
        unsafe { std::str::from_utf8_unchecked(&buf) }
            .parse()
            .ok()
            .expect("Parse error.")
    }
    pub fn vec<T: std::str::FromStr>(&mut self, n: usize) -> Vec<T> {
        (0..n).map(|_| self.read()).collect()
    }

    pub fn chars(&mut self) -> Vec<char> {
        self.read::<String>().chars().collect()
    }
}
