import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] w = new int[n];
    int min = Integer.MAX_VALUE;
    for(int i=0; i<n; i++) {
      w[i] = Integer.parseInt(str[i]);
    } 
    Arrays.parallelPrefix(w,Integer::sum);
    
    for(int i=0; i<n; i++) {
      min = Math.min(min,Math.abs(w[i]-(w[n-1]-w[i])));
    }
    System.out.println(min);
  }
}