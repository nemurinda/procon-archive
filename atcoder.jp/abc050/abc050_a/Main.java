import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    String op = str[1];
    int b = Integer.parseInt(str[2]);
    System.out.println(str[1].equals("+")?a+b:a-b);
  }
}