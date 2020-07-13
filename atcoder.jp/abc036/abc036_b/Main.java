import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[][] s = new String[n][n];
    String[] str = new String[n];
    for(int i=0; i<n; i++) {
      str = in.readLine().split("");
      for(int j=0; j<n; j++) {
        s[i][j] = str[j];
      }
    }
    
    for(int i=0; i<n; i++) {
      for(int j=n-1; j>=0; j--) {
        System.out.print(s[j][i]);
      }
      System.out.println();
    }
  }
}