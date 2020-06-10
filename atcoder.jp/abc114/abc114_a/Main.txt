import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(in.readLine());
    System.out.println(x==5||x==3||x==7?"YES":"NO");
  }
}