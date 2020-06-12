import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int c = Integer.parseInt(str[2]);
    int count = 0;
    boolean flg = false;
    for(int i=0; i<100000; i++) {
      if(a%2==0 && b%2==0 && c%2==0) {
        int a_tmp = a;
        int b_tmp = b;
        int c_tmp = c;
        a_tmp = b/2 + c/2;
        b_tmp = a/2 + c/2;
        c_tmp = a/2 + b/2;
        a = a_tmp;
        b = b_tmp;
        c = c_tmp;
        count += 1;
      } else {
        flg = true;
        break;
      }
    }
    System.out.println(flg == false?-1:count);
  }
}