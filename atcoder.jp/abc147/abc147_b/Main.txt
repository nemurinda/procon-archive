import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int n = s.length();
    int cnt = 0;
   for(int i = 0; i<n/2; i++) {
      if(s.charAt(i) != s.charAt(n-1-i)){
        cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}