import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    StringBuilder ans = new StringBuilder();
    ans.append(str[1] + str[0]);
    System.out.println(ans);
  }
}