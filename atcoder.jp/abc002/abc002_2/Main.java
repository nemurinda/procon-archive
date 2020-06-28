import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String w = in.readLine();
    for(int i=0; i<w.length(); i++) {
      if(w.charAt(i) == 'a' || w.charAt(i) == 'i' || w.charAt(i) == 'u'
         || w.charAt(i) == 'e' || w.charAt(i) == 'o') {
        continue;
      } else {
        System.out.print(w.charAt(i));
      }
    }
    System.out.println();
  }
}
