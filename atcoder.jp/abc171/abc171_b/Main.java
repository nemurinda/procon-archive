import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    int[] p = new int[n];
    int ans = 0;
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      p[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(p);
    for(int i=0; i<k; i++) {
      ans += p[i];
    }
    System.out.println(ans);
  }
}