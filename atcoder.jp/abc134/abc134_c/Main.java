import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] a = new int[n];
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(in.readLine());
    }
    
    int[] a_sort = a.clone();
    Arrays.sort(a_sort);
    
    if(n==1) {
      System.out.println(a_sort[0]);
      return;
    }
    
    for(int i=0; i<n; i++) {
      System.out.println(a_sort[n-1]!=a[i]?a_sort[n-1]:a_sort[n-2]);
    }
  }
}