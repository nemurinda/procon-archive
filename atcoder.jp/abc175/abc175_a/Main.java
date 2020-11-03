import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int count = 0;
    int ans = 0;
    for(int i=0; i<s.length(); i++) {
      if(s.charAt(i)=='R') {
	    count++;
        ans = Math.max(count,ans);
      } else {
        count=0;
      }
    }
    System.out.println(ans);
  }
}