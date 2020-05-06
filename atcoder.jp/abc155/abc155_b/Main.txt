import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    StringTokenizer stk = new StringTokenizer(in.readLine());
    in.close();
    int a[] = new int[n];
    boolean flg = true;
    for(int cnt = 0; cnt<n; cnt++){
      a[cnt] = Integer.parseInt(stk.nextToken());
      if(a[cnt]%2==0){
        if(a[cnt]%3!=0 && a[cnt]%5!=0)
          flg = false;
      }
    }
    if(flg == true)
      System.out.println("APPROVED");
    else
      System.out.println("DENIED");
  }
}