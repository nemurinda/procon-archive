import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    char[] s = in.readLine().toCharArray();
    in.close();
    
    for(int i = 0; i < s.length; i++) {
      int x = s[i] + n;
      if('Z' < x)
        x -= 26;
      s[i] = (char)x;
    }
    
    System.out.println(String.valueOf(s));
  }
}