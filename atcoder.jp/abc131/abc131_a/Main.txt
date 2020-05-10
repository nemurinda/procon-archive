import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    char[] c = str.toCharArray();
    System.out.println(c[0]==c[1]||c[1]==c[2]||c[2]==c[3]?"Bad":"Good");
  }
}