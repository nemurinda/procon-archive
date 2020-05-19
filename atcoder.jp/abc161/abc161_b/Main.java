import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    String[] a_str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    int[] a = new int[n];
    int sum = 0;
    int count = 0;

    for(int i = 0; i < n; i++) {
      a[i] = Integer.parseInt(a_str[i]);
      sum += a[i];
    }

    for(int i = 0; i < n; i++) {
      if((double)a[i] < (double)sum/(4*m)){
        count += 1;
      }
    }
    System.out.println(n-count>=m?"Yes":"No");
  }
}
