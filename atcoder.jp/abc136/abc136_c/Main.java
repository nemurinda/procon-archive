import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    
    int[] h = new int[n];
    for(int i=0; i<n; i++) {
      h[i] = Integer.parseInt(str[i]);
    }
    
    in.close();
    
    boolean hantei = true;
    
    for(int i=n-1; i>0; i--) {
      if(h.length==1) {
        System.out.println("Yes");
        return;
        
      } else if(h[i]<h[i-1]-1) {
        System.out.println("No");
        return;
        
      } else if(h[i]==h[i-1]-1) {
        h[i-1] -= 1;
      }
    }
    
    System.out.println("Yes");
  }
}