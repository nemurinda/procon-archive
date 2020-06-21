import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    Arrays.sort(str);
    System.out.println(str[0].equals("5") && str[1].equals("5") && str[2].equals("7")?"YES":"NO");
  }
}