import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int count = 0;
    String[] s = in.readLine().split("");
    for(int i=0; i<n-1; i++){
      if(s[i].equals(s[i+1])){
        count += 1;
      }
    }
    System.out.println(n-count);
  }
}