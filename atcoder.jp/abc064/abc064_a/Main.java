import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    StringBuilder buf = new StringBuilder();
    buf.append(str[0]);
    buf.append(str[1]);
    buf.append(str[2]);
    System.out.println(Integer.parseInt(buf.toString())%4==0?"YES":"NO");
  }
}