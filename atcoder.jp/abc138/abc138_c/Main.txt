import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    double[] v = new double[n];
    String[] str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      v[i] = Integer.parseInt(str[i]);
    }
    Arrays.sort(v);
    for(int i=0; i<n-1; i++) {
      v[i+1] = (v[i]+v[i+1])/2.00000;
    }
    System.out.println(v[n-1]);
  }
}