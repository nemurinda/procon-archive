import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int[] a = new int[n];
    int odd = 0;
    int even = 0;
    for(int i=0; i<n; i++) {
      a[i] = Integer.parseInt(str[i]);
      if(a[i]%2==0)
        even++;
      if(a[i]%2!=0)
        odd++;
    }
    
    System.out.println(odd%2!=0?"NO":"YES");
  }
}