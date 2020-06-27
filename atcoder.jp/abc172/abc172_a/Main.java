import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(in.readLine());
    System.out.println(a + (int)Math.pow(a,2) + (int)Math.pow(a,3));
  }
}