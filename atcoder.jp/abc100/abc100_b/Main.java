import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int d = Integer.parseInt(str[0]);
    int n = Integer.parseInt(str[1]);
    System.out.println(n==100?(int)Math.pow(100,d)*101:(int)Math.pow(100,d)*n);
  }
}