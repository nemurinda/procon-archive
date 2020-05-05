import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    System.out.println(str.charAt(0)==str.charAt(1)&&
                       str.charAt(1)==str.charAt(2)?"No":"Yes");
  }
}