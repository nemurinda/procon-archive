import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] s = new String[12];
    int count = 0;
    for(int i=0; i<12; i++) {
      s[i] = in.readLine();
      if(s[i].contains("r"))
        count++;
    }
    System.out.println(count);
  }
}