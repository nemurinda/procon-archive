import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int a[] = new int[m];
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      int k = Integer.parseInt(str[0]);
      for(int j=1; j<=k; j++) {
        int t = Integer.parseInt(str[j]);
        a[t-1]++;
      }
    }
    
    int count = 0;
    for(int i=0; i<m; i++) {
      if(a[i] == n)
        count++;
    }
    System.out.println(count);
  }
}