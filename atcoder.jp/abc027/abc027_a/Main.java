import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    if(str[0].equals(str[1]))
      System.out.println(str[2]);
    else if (str[0].equals(str[2]))
      System.out.println(str[1]);
    else if (str[1].equals(str[2]))
      System.out.println(str[0]);
  }
}