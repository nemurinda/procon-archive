import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int s = Integer.parseInt(in.readLine());
    int[] ary = new int[1000000];
    boolean roopFlg = false;
    for(int i=0; ; i++) {
      ary[i] = s;
      if(s%2==0)
        s=s/2;
      else
        s=3*s+1;
      for(int j=0; j<i; j++) {
        if(ary[i]==ary[j]) {
          System.out.println(i+1);
          roopFlg = true;
          break;
        }
      }
      if(roopFlg == true)
        break;
    }
  }
}