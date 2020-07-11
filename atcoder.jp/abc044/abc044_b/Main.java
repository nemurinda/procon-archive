import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    String[] w = str.split("");
    int[] cnt = new int[100];
    boolean flg = true;
    for(int i=0; i<str.length(); i++) {
      cnt[(int)w[i].charAt(0)-97]++;
    }
    
    for(int i=0; i<100; i++) {
      if(cnt[i]%2!=0) {
        System.out.println("No");
        flg = false;
        break;
      }
    }
    if(flg==true)
      System.out.println("Yes");
  }
}