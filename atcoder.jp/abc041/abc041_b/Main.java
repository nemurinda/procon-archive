import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long a = Long.parseLong(str[0]);
    long b = Long.parseLong(str[1]);
    long c = Long.parseLong(str[2]);
    long m = (long)Math.pow(10,9)+7;
    System.out.println(a*b%m*c%m);
  }
}