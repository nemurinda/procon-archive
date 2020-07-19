import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    int[] d = new int[k];
    int[] count = new int[n];
    for(int i=0; i<k; i++) {
      d[i] = Integer.parseInt(in.readLine());
      int[][] a = new int[k][d[i]];
      str = in.readLine().split(" ");
      for(int j=0; j<d[i]; j++) {
        a[i][j] = Integer.parseInt(str[j]);
        count[a[i][j]-1]++;
      }
    }
    
    int ans = 0;
    for(int i=0; i<n; i++) {
      if(count[i]==0)
        ans++;
    }
    
    System.out.println(ans);
  }
}