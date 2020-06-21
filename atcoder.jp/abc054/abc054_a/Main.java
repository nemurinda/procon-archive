import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    if(a>b && b!=1 || a==1 && b!=1)
      System.out.println("Alice");
    else if(a<b || b==1 && a!=1)
      System.out.println("Bob");
    else
      System.out.println("Draw");
  }
}