import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String args[]) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String n = in.readLine();
    int sum = 0;
    for(int i=0; i<n.length(); i++) {
      sum += Integer.parseInt(n.substring(i, i+1));
    }
    System.out.println(sum%9==0?"Yes":"No");
  }
}