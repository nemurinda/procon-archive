import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    double a = Double.parseDouble(str[0]);
    double b = Double.parseDouble(str[1]);
    double c = Double.parseDouble(str[2]);
    double d = Double.parseDouble(str[3]);
    if(b/a>d/c)
      System.out.println("TAKAHASHI");
    else if(b/a<d/c)
      System.out.println("AOKI");
    else
      System.out.println("DRAW");
  }
}