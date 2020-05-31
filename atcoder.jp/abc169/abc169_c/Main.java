import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigDecimal;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    BigDecimal a = new BigDecimal(str[0]);
    BigDecimal b = new BigDecimal(str[1]);
    System.out.println((a.multiply(b)).setScale(0,BigDecimal.ROUND_DOWN));
  }
}