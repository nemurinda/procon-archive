import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    int count = 0;
    String[] str = in.readLine().split(" ");
    for(int i = 0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
      for(int j = a[i]; j>0; j--) {
        if(j%3==2 || j%2==0)
          count++;
        else
          break;
      }
    }
    System.out.println(count);
  }
}