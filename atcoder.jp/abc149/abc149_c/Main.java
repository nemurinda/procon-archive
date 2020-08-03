import java.util.Scanner;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    BigInteger b = in.nextBigInteger();
    if(b.isProbablePrime(70)==true)
      System.out.println(b);
    else
      System.out.println(b.nextProbablePrime());
  }
}