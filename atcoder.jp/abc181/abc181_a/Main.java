import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    System.out.println(n%2==0?"White":"Black");
  }
}