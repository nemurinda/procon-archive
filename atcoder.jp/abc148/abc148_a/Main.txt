import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(in.readLine());
    int b = Integer.parseInt(in.readLine());
    int sum = 6;
    System.out.println(sum-a-b);
  }
}