import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String o = in.readLine();
    String e = in.readLine();
    for(int i=0; i<o.length()-1; i++) {
      System.out.print(o.substring(i,i+1));
      System.out.print(e.substring(i,i+1));
    }
    System.out.print(o.substring(o.length()-1,o.length()));
    if(o.length()-e.length()!=1)
      System.out.print(e.substring(o.length()-1,o.length()));
  }
}