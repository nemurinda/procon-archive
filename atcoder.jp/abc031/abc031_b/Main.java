import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int l = Integer.parseInt(str[0]);
    int h = Integer.parseInt(str[1]);
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
      if(a[i]>h)
        System.out.println(-1);
      else if(a[i]<=h && a[i]>=l)
        System.out.println(0);
      else
        System.out.println(l-a[i]);
    }
  }
}