import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] r = new int[n];
    double sum = 0;
    for(int i=0; i<n; i++) {
      r[i] = Integer.parseInt(in.readLine());
    }
    Arrays.sort(r);
    for(int i=n-1; i>=0; i=i-2){
      sum += Math.pow(r[i],2);
    }
    for(int i=n-2; i>=0; i=i-2){
      sum = sum-Math.pow(r[i],2);
    }
    System.out.println(sum * Math.PI);
  }
}