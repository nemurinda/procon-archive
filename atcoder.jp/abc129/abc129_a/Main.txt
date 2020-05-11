import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int p = Integer.parseInt(str[0]);
    int q = Integer.parseInt(str[1]);
    int r = Integer.parseInt(str[2]);
    
    int ans = 0;
    System.out.println(Math.min(p+q,Math.min(q+r,p+r)));
  }
}