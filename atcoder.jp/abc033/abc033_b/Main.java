import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] s = new String[n];
    int[] p = new int[n];
    String[] str = new String[n];
    int sum = 0;
    String majorityAns = "";
    
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      s[i] = str[0];
      p[i] = Integer.parseInt(str[1]);
      sum += p[i];
    }
    
    for(int i=0; i<n; i++) {
      if(sum/2<p[i])
        majorityAns = s[i];
    }

    System.out.println(majorityAns!=""?majorityAns:"atcoder");
  }
}