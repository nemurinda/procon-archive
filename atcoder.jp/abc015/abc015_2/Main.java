import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    String[] str = in.readLine().split(" ");
    int sum = 0;
    int count = 0;
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
      if(a[i]!=0)
        count++;
      sum += a[i];
    }
    System.out.println(sum%count==0?(sum/count):(sum/count)+1);
  }
}
    