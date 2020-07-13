import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int[] a = new int[m];
    int[] b = new int[m];
    for(int i=0; i<m; i++) {
      str = in.readLine().split(" ");
      a[i] = Integer.parseInt(str[0]);
      b[i] = Integer.parseInt(str[1]);
    }
    
    int[] count = new int[n];
    for(int i=0; i<m; i++) {
      for(int j=1; j<=n; j++) {
        if(a[i] == j)
          count[j-1]+=1;
        if(b[i] == j)
          count[j-1]+=1;
      }
    }
    
    for(int i=0; i<n; i++) {
      System.out.println(count[i]);
    }
  }
}