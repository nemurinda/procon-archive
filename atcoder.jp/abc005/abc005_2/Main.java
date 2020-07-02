import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Integer n = Integer.parseInt(in.readLine());
    int[] t = new int[n];
    int min = 1000;
    for(int i=0; i<n; i++) {
      t[i] = Integer.parseInt(in.readLine());
      min = Math.min(t[i],min);
    }
    System.out.println(min);
  }
}