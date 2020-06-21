import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    System.out.println(str[0].substring(0,1) + str[1].substring(0,1) + str[2].substring(0,1));
  }
}