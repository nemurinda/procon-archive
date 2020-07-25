import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int k = Integer.parseInt(in.readLine());
    str = in.readLine().split(" ");
    int[] p = new int[k];
    boolean ans_flg = true;
    for(int i = 0; i < k; i++) {
      p[i] = Integer.parseInt(str[i]);
      if(a==p[i] || b==p[i]) {
        ans_flg = false;
        break;
      }
      
      for(int j = 0; j < i; j++) {
        if(p[i] == p[j]) {
          ans_flg = false;
          break;
        }
      }
      
      if(ans_flg == false)
        break;
    }
    
    System.out.println(ans_flg == true?"YES":"NO");
  }
}