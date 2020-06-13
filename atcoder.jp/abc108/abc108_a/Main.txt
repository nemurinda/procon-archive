import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(in.readLine());
    if(k%2!=0)
      System.out.println((k/2)*(k/2+1));
    else
      System.out.println((k/2)*(k/2));
  }
}