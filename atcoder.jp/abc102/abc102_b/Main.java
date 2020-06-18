import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    int min = 1000000000;
    int max = 0;
    String[] str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
      min = Math.min(min,a[i]);
      max = Math.max(max,a[i]);
    }
    System.out.println(max-min);
  }
}