import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long a = Integer.parseInt(str[0]);
    long b = Integer.parseInt(str[1]);
    long c = Integer.parseInt(str[2]);
    long d = Integer.parseInt(str[3]);
    System.out.println(Math.max(a*c,Math.max(a*d,(Math.max(b*c,b*d)))));
  }
}