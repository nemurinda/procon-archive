import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String t = in.readLine();
    int count = 0;
    for(int i=0; i<s.length(); i++) {
      if(!s.substring(i,i+1).equals(t.substring(i,i+1)))
        count += 1;
    }
    System.out.println(count);
  }
}