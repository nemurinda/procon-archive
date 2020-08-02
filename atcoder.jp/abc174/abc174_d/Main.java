import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String c_str = in.readLine();

    int r_count = 0;
    for(int i=0; i<n; i++) {
      if(c_str.charAt(i) == 'R')
        r_count++;
    }

    String c_splt = c_str.substring(0,r_count);
    String[] c_splt_ary = c_splt.split("");
    int ans = 0;
    for(int i=0; i<r_count; i++) {
      if(c_splt_ary[i].equals("W"))
        ans++;
    }

    System.out.println(ans);
  }
}