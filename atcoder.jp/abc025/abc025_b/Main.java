import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int a = Integer.parseInt(str[1]);
    int b = Integer.parseInt(str[2]);
    String[] s = new String[n];
    int[] d = new int[n];
    int ans = 0;
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      s[i] = str[0];
      d[i] = Integer.parseInt(str[1]);
      if(s[i].equals("East"))
        if(d[i] < a)
          ans += a;
        else if(d[i]>b)
          ans += b;
        else
          ans += d[i];
      else
        if(d[i] < a)
          ans = ans - a;
        else if(d[i]>b)
          ans = ans - b;
        else
          ans = ans - d[i];
    }
    
    if(ans>=1)
      System.out.println("East " + ans);
    else if(ans == 0)
      System.out.println(0);
    else
      System.out.println("West " + Math.abs(ans));
  }
}