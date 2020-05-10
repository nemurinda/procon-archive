import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String t = in.readLine();
    int s_len = s.length();
    System.out.println(s.equals(t.substring(0,s_len))?"Yes":"No");
  }
}