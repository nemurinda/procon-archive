import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    for(int i=0; i<str.length(); i++) {
      if(i==0)
        System.out.print(str.substring(i,i+1).toUpperCase());
      else
        System.out.print(str.substring(i,i+1).toLowerCase());
    }
    System.out.println();
  }
}