import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int w = Integer.parseInt(str[0]);
    int h = Integer.parseInt(str[1]);
    System.out.println(3*w!=4*h?"16:9":"4:3");
  }
}