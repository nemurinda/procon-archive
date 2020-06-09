import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] p = new int[n];
    int max = 0;
    int sum = 0;
    for(int i=0; i<n; i++) {
      p[i] = Integer.parseInt(in.readLine());
      max = Math.max(p[i],max);
      sum += p[i];
    }
    System.out.println(sum-(max/2));
  }
}