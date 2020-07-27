import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int n = Integer.parseInt(in.readLine());
    int[] l = new int[n];
    int[] r = new int[n];
    String[] str = new String[n];
    String sb_rev = "";
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      l[i] = Integer.parseInt(str[0]);
      r[i] = Integer.parseInt(str[1]);
      StringBuffer sb = new StringBuffer(s.substring(l[i]-1,r[i]));
      sb_rev = sb.reverse().toString();
      s = s.substring(0,l[i]-1) + sb_rev + s.substring(r[i],s.length());
    }
    System.out.println(s);
  }
}