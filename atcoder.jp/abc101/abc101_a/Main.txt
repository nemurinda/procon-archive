import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split("");
    int ans = 0;
    for(int i=0; i<4; i++) {
      if(str[i].equals("+"))
        ans++;
      else
        ans--;
    }
    System.out.println(ans);
  }
}