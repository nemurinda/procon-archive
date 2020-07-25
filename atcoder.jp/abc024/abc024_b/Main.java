import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int t = Integer.parseInt(str[1]);
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
    }
    
    int sum = t;
    for(int i=1; i<n; i++) {
      int diff = a[i]-a[i-1];
      if(diff>=t)
        sum += t;
      else
        sum += diff;
    }
    
    System.out.println(sum);
  }
}