import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long n = Long.parseLong(str[0]);
    long k = Long.parseLong(str[1]);
    System.out.println(n%k<=k-n%k?n%k:k-n%k);
  }
}

