import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int k = Integer.parseInt(in.readLine());
    int x = Integer.parseInt(in.readLine());
    int y = Integer.parseInt(in.readLine());
    System.out.println(n>=k?k*x+(n-k)*y:n*x);
  }
}