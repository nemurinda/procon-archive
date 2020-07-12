import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] s = in.readLine().split("");
    int x = 0;
    int max = 0;
    for(int i=0; i<n; i++) {
       if(s[i].charAt(0)=='I') {
        x++;
        max = Math.max(max,x);
      }
      if(s[i].charAt(0)=='D')
        x=x-1;
    }
    System.out.println(max);
  }
}