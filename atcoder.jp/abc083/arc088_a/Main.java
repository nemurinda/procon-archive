import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner in = new Scanner(System.in);
    BigInteger x = in.nextBigInteger();
    BigInteger y = in.nextBigInteger();
    BigInteger sum = x;
    long count = 0;
    while(sum.compareTo(y) != 1) {
      sum = sum.multiply(BigInteger.valueOf(2));
      count++;
    }
    System.out.println(count);
  }
}