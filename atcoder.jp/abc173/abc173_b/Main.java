import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] ary = {"AC","WA","TLE","RE"};
    String[] s = new String[n];
    int[] s_ans = new int[n];
    int ac = 0;
    int wa = 0;
    int tle = 0;
    int re = 0;
    for(int i=0; i<n; i++) {
      s[i] = in.readLine();
      for(int j=0; j<4; j++) {
        if(s[i].equals(ary[j]))
          s_ans[i] = j;
      }
      if(s_ans[i]==0)
        ac++;
      if(s_ans[i]==1)
        wa++;
      if(s_ans[i]==2)
        tle++;
      if(s_ans[i]==3)
        re++;
    }
    System.out.println("AC x " + ac);
    System.out.println("WA x " + wa);
    System.out.println("TLE x " + tle);
    System.out.println("RE x " + re);
  }
}