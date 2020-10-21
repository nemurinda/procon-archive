import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int d = Integer.parseInt(str[0]);
    int t = Integer.parseInt(str[1]);
    int s = Integer.parseInt(str[2]);
    System.out.println(d-t*s<=0?"Yes":"No");
  }
}