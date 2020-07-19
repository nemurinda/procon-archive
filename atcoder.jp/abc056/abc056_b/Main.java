import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int w = Integer.parseInt(str[0]);
    int a = Integer.parseInt(str[1]);
    int b = Integer.parseInt(str[2]);
    
    if(b+w<a)
      System.out.println(a-(b+w));
    else if(a+w<b)
      System.out.println(b-(a+w));
    else
      System.out.println(0);
  }
}