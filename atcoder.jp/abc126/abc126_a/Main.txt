import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    String s = in.readLine();
    String tmp = String.valueOf(s.charAt(k-1)).toLowerCase();
    System.out.println(s.substring(0,k-1) + tmp + s.substring(k));
  }
}