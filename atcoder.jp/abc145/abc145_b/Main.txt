import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String s = in.readLine();
    String t = s.substring(0,n/2);
    System.out.println((t+t).equals(s)?"Yes":"No");
  }
}