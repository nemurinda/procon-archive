import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(in.readLine());
    in.close();
    
    long k = (int)Math.sqrt(n);
    while(n%k!=0){
      k--;
    }
    
    System.out.println(Math.max(String.valueOf(k).length(),
                                String.valueOf(n/k).length()));
  }
}