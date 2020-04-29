import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    char[] n = reader.readLine().toCharArray();
    if(n[0]=='7'|| n[1]=='7'|| n[2]=='7')
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}