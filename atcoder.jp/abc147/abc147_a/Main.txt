import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a1 = Integer.parseInt(str[0]);
    int a2 = Integer.parseInt(str[1]);
    int a3 = Integer.parseInt(str[2]);
    System.out.println(a1+a2+a3>=22?"bust":"win");
  }
}