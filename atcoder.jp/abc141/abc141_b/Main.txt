import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    boolean flg = true;
    for(int i=0; i<s.length(); i++){
      if(i%2==0){
        if(s.charAt(i)=='L') {
          flg = false;
          break;
        }
      }
      if(i%2!=0){
        if(s.charAt(i)=='R') {
          flg = false;
          break;
        }
      }
    }
    System.out.println(flg==false?"No":"Yes");
  }
}