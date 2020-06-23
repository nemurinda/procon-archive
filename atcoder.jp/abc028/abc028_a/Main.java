import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    if(n==100)
      System.out.println("Perfect");
    else if(n>=90)
      System.out.println("Great");
    else if(n>=60)
      System.out.println("Good");
    else
      System.out.println("Bad");
  }
}