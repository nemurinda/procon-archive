import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String a = in.readLine();
    String b = in.readLine();
    System.out.println(a.length()>b.length()?a:b);
  }
}