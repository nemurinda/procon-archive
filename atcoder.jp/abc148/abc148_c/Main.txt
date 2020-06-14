import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.io.PrintWriter;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long a = Long.parseLong(str[0]);
    long b = Long.parseLong(str[1]);
    
    long min = a<b?a:b;
    long max = a>b?a:b;
    
    for(long i=1; i<=max; i++) {
      if(min*i%max==0) {
        System.out.println(min*i);
        break;
      }
    }
  }
}