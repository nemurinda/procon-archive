import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    if(n/3600>=10) {
      System.out.print(n/3600 + ":");
      n = n%3600;
    } else {
      System.out.print("0" + n/3600 + ":");
      n = n%3600;
    }
    if(n/60>=10) {
      System.out.print(n%60>=10?n/60 + ":" + n%60:n/60 + ":0" + n%60);
    } else {
      System.out.print(n%60>=10?"0" + n/60 + ":" + n%60:"0" + n/60 + ":0" + n%60);
    }
  }
}