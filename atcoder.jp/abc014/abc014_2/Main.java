import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    final int n = Integer.parseInt(str[0]);
    final int x = Integer.parseInt(str[1]);
    final int bit = 1;
    int ans = 0;
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      int tmp = Integer.parseInt(str[i]);
      if(((x>>i)&1) == 1)
        ans += tmp;
    }
    System.out.println(ans);
  }
}