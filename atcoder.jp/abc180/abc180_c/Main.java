import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long n = Long.parseLong(in.readLine());
    TreeSet<Long> divisor = new TreeSet<>();
    for(long i=1; i*i<=n; i++) {
      if(n%i==0) {
        divisor.add(i);
        divisor.add(n/i);
      }
    }
    for(Long i: divisor) {
      System.out.println(i);
    }
  }
}