import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    double n = Integer.parseInt(in.readLine());
    int[] ary = new int[(int)n];
    int sum = 0;
    for(int i=0; i<n; i++) {
      ary[i] = 10000 * (i+1);
      sum += ary[i];
    }
    System.out.println((int)(sum * (1/n)));
  }
}