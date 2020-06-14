import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int x = Integer.parseInt(str[0]);
    int y = Integer.parseInt(str[1]);
    boolean flg = false;
    for(int i=0; i<=x; i++) {
      if(2*i+4*(x-i)==y) {
        System.out.println("Yes");
        flg = true;
        break;
      }
    }
    System.out.println(flg==false?"No":"");
  }
}