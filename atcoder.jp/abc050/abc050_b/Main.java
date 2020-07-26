import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] t = new int[n];
    String[] str = in.readLine().split(" ");
    int t_sum = 0;
    for(int i=0; i<n; i++) {
      t[i] = Integer.parseInt(str[i]);
      t_sum += t[i];
    }
    
    int m = Integer.parseInt(in.readLine());
    int[] p = new int[m];
    int[] x = new int[m];
    for(int i=0; i<m; i++) {
      str = in.readLine().split(" ");
      p[i] = Integer.parseInt(str[0]);
      x[i] = Integer.parseInt(str[1]);
      System.out.println(t_sum - (t[p[i]-1]-x[i]));
    }
  }
}