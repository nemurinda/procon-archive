import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int q = Integer.parseInt(str[1]);
    int[] l = new int[q];
    int[] r = new int[q];
    int[] t = new int[q];
    int[] ary = new int[n];
    for(int i=0; i<q; i++) {
      str = in.readLine().split(" ");
      l[i] = Integer.parseInt(str[0]);
      r[i] = Integer.parseInt(str[1]);
      t[i] = Integer.parseInt(str[2]);
      for(int j = l[i]-1; j<r[i]; j++) {
        ary[j] = t[i];
      }
    }
    for(int i=0; i<n; i++) {
      System.out.println(ary[i]);
    }
  }
}