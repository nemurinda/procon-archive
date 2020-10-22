import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int ans = 0;
    for(int i=1; i<=n; i++) {
      ans += (n-1)/i;
    }
    System.out.println(ans);
  }
}