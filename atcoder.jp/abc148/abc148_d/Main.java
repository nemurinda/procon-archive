import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] a = new int[n];
    int hantei = 1;
    int cntContinuous = 0;
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
      if(hantei == a[i]) {
        cntContinuous++;
        hantei++;
      }
    }
    
    System.out.println(cntContinuous==0?-1:n-cntContinuous);
  }
}