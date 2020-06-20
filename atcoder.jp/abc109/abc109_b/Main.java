import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] w = new String[n];
    w[0] = in.readLine();
    boolean flg = true;
    for(int i=1; i<n; i++) {
      w[i] = in.readLine();
      if(!w[i-1].substring(w[i-1].length()-1,w[i-1].length()).equals(w[i].substring(0,1))){
        flg = false;
        break;
      }
      for(int j=0; j<i; j++) {
        if(w[i].equals(w[j])){
          flg = false;
          break;
        }
      }
    }
    System.out.println(flg==true?"Yes":"No");
  }
}