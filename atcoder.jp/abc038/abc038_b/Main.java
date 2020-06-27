import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    String[] str2 = in.readLine().split(" ");
    System.out.println(str[0].equals(str2[0]) 
                       || str[1].equals(str2[1])
                       || str[0].equals(str2[1])
                       || str[1].equals(str2[0])?"YES":"NO");
  }
}