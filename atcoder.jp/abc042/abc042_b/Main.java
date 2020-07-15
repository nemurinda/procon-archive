import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int l = Integer.parseInt(str[1]);
    String[] s = new String[n];

    for(int i=0; i<n; i++) {
      s[i] = in.readLine();
    }
    
    Arrays.sort(s);
    
    for(int i=0; i<n; i++) {
      System.out.print(s[i]);
    }
    
    System.out.println();
  }
}