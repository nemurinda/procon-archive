import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    long ans = 1;
    for(int i=1; i<=n; i++) {
      ans = (ans*i)%(int)(Math.pow(10,9)+7);
    }
    
    System.out.println(ans);
  }
}