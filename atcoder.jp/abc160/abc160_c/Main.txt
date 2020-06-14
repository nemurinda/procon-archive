import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int k = Integer.parseInt(str[0]);
    int n = Integer.parseInt(str[1]);
    int[] a = new int[n];
    str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
    }
    int sep = k-a[n-1]+a[0];
    for(int i=1; i<n; i++) {
      sep = Math.max(sep,a[i] - a[i-1]);
    }
    System.out.println(k-sep);
  }
}