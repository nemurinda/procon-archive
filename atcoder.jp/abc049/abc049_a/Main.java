import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] vow = {"a","e","i","o","u"};
    String str = in.readLine();
    boolean vowFlg = false;
    for(int i=0; i<5; i++) {
      if(str.equals(vow[i]))
        vowFlg = true;
    }
    System.out.println(vowFlg==true?"vowel":"consonant");
  }
}