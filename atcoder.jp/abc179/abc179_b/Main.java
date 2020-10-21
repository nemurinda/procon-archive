import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] arg) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = new String[2];
    int[] d = new int[2];
    int count = 0;
    boolean ansFlg = false;
    for(int i=0; i<n; i++) {
      str = in.readLine().split(" ");
      d[0] = Integer.parseInt(str[0]);
      d[1] = Integer.parseInt(str[1]);
      if(d[0]==d[1])
        count++;
      else
        count = 0;
      
      if(count==3)
        ansFlg = true;
    }
    System.out.println(ansFlg==true?"Yes":"No");
  }
}