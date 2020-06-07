import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long k = Long.parseLong(in.readLine());
    long sum = 0L;
    for(int a=1; a<=k; a++)
      for(int b=1; b<=k; b++)
        for(int c=1; c<=k; c++)
          sum += gcd(gcd(a,b),c);
    System.out.println(sum);
  }
  public static long gcd(long a, long b) {
    if(a>b) {
      long t = a;
      a = b;
      b = t;
    }
    if(a == 0L)
      return b;
    return gcd(b%a,a);
  }
}