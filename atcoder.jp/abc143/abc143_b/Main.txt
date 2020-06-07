import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] d = new int[n];
    int sum = 0;
    
    for(int i=0; i<n; i++) {
      d[i] = Integer.parseInt(str[i]);
    }
    
    for(int i=0; i<n; i++) {
      for(int j=i+1; j<n; j++) {
        sum += d[i] * d[j];
      }
    }
    System.out.println(sum);
  }
}