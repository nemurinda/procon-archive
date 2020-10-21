import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String t = in.readLine();
    int ans = t.length();
    for(int i=0; i<=s.length()-t.length(); i++) {
      int diff = 0;
      for(int j=0; j<t.length(); j++) {
        if(t.charAt(j)!=s.charAt(i+j))
          diff++;
      }
      ans = Math.min(diff, ans);
    }
    
    System.out.println(ans);
  }
}