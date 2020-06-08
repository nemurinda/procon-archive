import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int d = Integer.parseInt(in.readLine());
    if(d==25)
      System.out.println("Christmas");
    else if(d==24)
      System.out.println("Christmas Eve");
    else if(d==23)
      System.out.println("Christmas Eve Eve");
    else
      System.out.println("Christmas Eve Eve Eve");
  }
}
     