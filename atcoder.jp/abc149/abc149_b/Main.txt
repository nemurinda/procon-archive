import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long a = Long.parseLong(str[0]);
    long b = Long.parseLong(str[1]);
    long k = Long.parseLong(str[2]);
    if(a>=k){
      a -= k;
    } else if(b>=k-a){
      b = b-(k-a);
      a = 0;
    } else {
      a = 0;
      b = 0;
    }
    System.out.println(a + " " + b);
  }
}