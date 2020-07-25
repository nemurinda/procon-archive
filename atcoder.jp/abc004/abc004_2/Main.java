import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = new String[4];
    String[][] c = new String[4][4];
    for(int i=0; i<=3; i++) {
      str = in.readLine().split(" ");
      for(int j=0; j<=3; j++) {
        c[i][j] = str[j];
      }
    }
    
    for(int i=3; i>=0; i--) {
      for(int j=3; j>=0; j--) {
        System.out.print(c[i][j]);
        if(j!=0)
          System.out.print(" ");
      }
      System.out.println();
    }
  }
}