import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(in.readLine());
    String s = in.readLine();
    
    if(s.length()<=k)
      System.out.println(s);
    else
      System.out.println(s.substring(0,k) + "...");
  }
}