import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(in.readLine());
    int b = Integer.parseInt(in.readLine());
    if(Math.abs(a-b)>=5)
      System.out.println(10-Math.abs(a-b));
    else
      System.out.println(Math.abs(a-b));
  }
}