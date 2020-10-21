import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    long[] x = new long[n];
    long xMax = 0;
    long xSum = 0;
    long xPowSum = 0;
    
    for(int i=0; i<n; i++) {
      x[i] = Long.parseLong(str[i]);
      xMax = Math.max(xMax, Math.abs(x[i]));
      xSum += Math.abs(x[i]);
      xPowSum += Math.pow(Math.abs(x[i]),2);
    }
    
    System.out.println(xSum);
    System.out.println(Math.sqrt(xPowSum));
    System.out.println(xMax);

  }
}