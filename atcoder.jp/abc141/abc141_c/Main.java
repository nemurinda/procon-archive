import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    int q = Integer.parseInt(str[2]);
    int[] a = new int[q];
    int[] count = new int[n];
    for(int i=0; i<q; i++) {
      a[i] = Integer.parseInt(in.readLine());
      count[a[i]-1]++;
    }
    
    for(int i=0; i<n; i++) {
      if(k-(q-count[i])<=0)
        System.out.println("No");
      else
        System.out.println("Yes");
    }
  }
}