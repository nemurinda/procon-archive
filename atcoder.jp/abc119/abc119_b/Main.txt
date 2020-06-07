import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    double sum = 0;
    double[] x = new double[n];
    String[] u = new String[n];
    
    for(int i=0; i<n; i++) {
      String[] str = in.readLine().split(" ");
      x[i] = Double.parseDouble(str[0]);
      u[i] = str[1];
      if(u[i].equals("BTC"))
        x[i] = x[i]*380000.0;
      sum += x[i];
    }
    System.out.println(sum);
  }
}