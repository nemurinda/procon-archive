import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] l = new int[n];
    for(int i=0; i<n; i++) {
      l[i] = Integer.parseInt(str[i]);
    }
    
    Arrays.sort(l);
    
    int count = 0;
    for(int i=0; i<n-2; i++) {
      for(int j=i+1; j<n-1; j++) {
        for(int k=j+1; k<n; k++) {
          if(l[i]+l[j]>l[k] && l[i]!=l[k] && l[i]!=l[j] && l[j]!=l[k]) {
            count++;
          }
        }
      }
    }
    
    System.out.println(count);
  }
}