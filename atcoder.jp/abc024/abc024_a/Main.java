import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int c = Integer.parseInt(str[2]);
    int k = Integer.parseInt(str[3]);
    str = in.readLine().split(" ");
    int s = Integer.parseInt(str[0]);
    int t = Integer.parseInt(str[1]);
    if(s+t>=k)
      System.out.println(s*(a-c)+t*(b-c));
    else
      System.out.println(s*a+t*b);
  }
}