import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    if(1<=n && n<=104)
      System.out.println(0);
    else if(105<=n && n<=134)
      System.out.println(1);
    else if(135<=n && n<=164)
      System.out.println(2);
    else if(165<=n && n<=188)
      System.out.println(3);
    else if(189<=n && n<=194)
      System.out.println(4);
    else if(195<=n && n<=200)
      System.out.println(5);
  }
}