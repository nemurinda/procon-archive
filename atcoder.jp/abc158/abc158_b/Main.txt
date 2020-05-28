import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    long n = Long.parseLong(str[0]);
    long a = Long.parseLong(str[1]);
    long b = Long.parseLong(str[2]);
    long quo = n/(a+b);
    long rem = n%(a+b);
    //System.out.println(quo + " " + rem);
    if(rem>a)
      System.out.println(quo*a + a);
    else
      System.out.println(quo*a + rem);
  }
}