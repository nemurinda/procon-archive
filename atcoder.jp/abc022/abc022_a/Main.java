import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int s = Integer.parseInt(str[1]);
    int t = Integer.parseInt(str[2]);
    int[] a = new int[n];
    int sum = 0;
    int count = 0;
    for(int i = 0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
      sum += a[i];
      if(sum >=s && sum <= t)
        count++;
    }
    System.out.println(count);
  }
}