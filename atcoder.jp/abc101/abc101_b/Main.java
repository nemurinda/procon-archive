import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    int n = Integer.parseInt(str);
    int sn = 0;
    for(int i = 0; i < str.length(); i++) {
      sn += Integer.parseInt(str.substring(i,i+1));
    }
    System.out.println(n%sn==0?"Yes":"No");
  }
}