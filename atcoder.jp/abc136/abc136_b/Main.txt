import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int cnt = 0;

    for(int i = 1; i <= n; i++) {
      String s = String.valueOf(i);
      int s_length = s.length();
      if(s_length%2!=0) {
        cnt +=1;
      }
    }
    
    System.out.println(cnt);
  }
}