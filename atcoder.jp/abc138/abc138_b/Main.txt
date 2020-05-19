import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] a_str = in.readLine().split(" ");
    double[] a = new double[n];
    double sum = 0;
    
    for(int i = 0; i < n; i++){
      a[i] = (double)1/Integer.parseInt(a_str[i]);
      sum += a[i];
    }
    System.out.println((double)1/sum);
  }
}