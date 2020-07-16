import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int count = 0;
    for(int i=0; i<s.length(); i++) {
        count++;
      if(i==s.length()-1 || (i!=s.length()-1 && s.charAt(i)!=s.charAt(i+1))) {
        System.out.print(s.charAt(i)  + "" + count);
        count = 0;
      }
    }
    System.out.println();
  }
}