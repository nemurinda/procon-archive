import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String t = in.readLine();
    System.out.println(s.equals("Y")?t.toUpperCase():t);
  }
}