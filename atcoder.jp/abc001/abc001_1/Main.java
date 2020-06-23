import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int h1 = Integer.parseInt(in.readLine());
    int h2 = Integer.parseInt(in.readLine());
    System.out.println(h1-h2);
  }
}