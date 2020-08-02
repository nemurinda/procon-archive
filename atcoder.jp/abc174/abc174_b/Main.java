import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    double d = Double.parseDouble(str[1]);
    int[] x = new int[n];
    int[] y = new int[n];
    int count = 0;
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      x[i] = Integer.parseInt(str[0]);
      y[i] = Integer.parseInt(str[1]);
      double diff = Math.sqrt(Math.pow(x[i],2)+Math.pow(y[i],2));
      if(diff<=d) {
        count++;
      }
    }
    System.out.println(count);
  }
}