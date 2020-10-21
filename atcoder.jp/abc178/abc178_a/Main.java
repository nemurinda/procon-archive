import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] arg) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String x = in.readLine();
    System.out.println(x.equals("0")?1:0);
  }
}