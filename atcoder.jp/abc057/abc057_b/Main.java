import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int[] a = new int[n];
    int[] b = new int[n];
    int[] c = new int[m];
    int[] d = new int[m];
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      a[i] = Integer.parseInt(str[0]);
      b[i] = Integer.parseInt(str[1]);
    }
    for(int i=0; i<m; i++) {
      str = in.readLine().split(" ");
      c[i] = Integer.parseInt(str[0]);
      d[i] = Integer.parseInt(str[1]);
    }
    
    for(int i=0; i<n; i++) {
      int min = 1000000000;
      int num = 0;
      for(int j=0; j<m; j++) {
        if(min > Math.abs(a[i]-c[j])+Math.abs(b[i]-d[j])) {
          min = Math.abs(a[i]-c[j])+Math.abs(b[i]-d[j]);
          num = j+1;
        }
      }
      System.out.println(num);
    }
  }
}