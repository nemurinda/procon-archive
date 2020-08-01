import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    String[] str = in.readLine().split(" ");
    int[] count = new int[100003];
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
      count[a[i]]++;
      count[a[i]+1]++;
      count[a[i]+2]++;
    }
    in.close();
    
    Arrays.sort(count);
    System.out.println(count[100002]);
  }
}