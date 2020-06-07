import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int d = Integer.parseInt(str[1]);
    int watchman = (d*2)+1;
    if(n%watchman != 0)
      System.out.println(n/watchman + 1);
    else
      System.out.println(n/watchman);
  }
}