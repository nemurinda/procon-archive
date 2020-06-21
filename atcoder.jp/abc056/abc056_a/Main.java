import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    if(str[0].equals("H"))
      if(str[1].equals("H"))
        System.out.println("H");
      else
        System.out.println("D");
    else
      if(str[1].equals("H"))
        System.out.println("D");
      else
        System.out.println("H");
  }
}