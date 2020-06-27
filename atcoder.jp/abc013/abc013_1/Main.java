import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String x = in.readLine();
    String str = "ABCDE";
    for(int i=0; i<5; i++) {
      if(str.charAt(i)==x.charAt(0))
        System.out.println((int)x.charAt(0)-(int)'A'+1);
    }
  }
}