import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int k = Integer.parseInt(str[1]);
    if(n==1)
      System.out.println(k);
    else
      System.out.println(k*(int)Math.pow(k-1,n-1));
  }
}