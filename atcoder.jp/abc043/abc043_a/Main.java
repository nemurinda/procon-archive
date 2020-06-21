import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int sum = 0;
    for(int i=1; i<=n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }
}