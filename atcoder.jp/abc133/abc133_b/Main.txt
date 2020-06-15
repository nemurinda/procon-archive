import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int d = Integer.parseInt(str[1]);
    int[][] p = new int[n][d];
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      for(int j=0; j<d; j++) {
        p[i][j] = Integer.parseInt(str[j]);
      }
    }
    int count = 0;
    for(int i=0; i<n; ++i) {
      for(int j=i+1; j<n; ++j) {
        if(f(p[i],p[j],d))
          ++count;
      }
    }
    System.out.println(count);
  }
  
  private static boolean f(int[] p,int[] p2,int n) {
    int sum = 0;
    for(int i=0; i<n; ++i) 
      sum += (p[i]-p2[i]) * (p[i]-p2[i]);
    return Math.abs(Math.pow((int)Math.sqrt(sum),2)-sum)<0.001;
  }
}