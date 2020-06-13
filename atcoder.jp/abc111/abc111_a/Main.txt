import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split("");
    for(int i=0; i<3; i++) {
      if(str[i].equals("1"))
        str[i]="9";
      else
        str[i]="1";
      System.out.print(str[i]);
    }
  }
}