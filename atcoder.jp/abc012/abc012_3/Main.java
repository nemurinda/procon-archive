import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int sum = 0;
    for(int i=1; i<=9; i++) {
      for(int j=1; j<=9; j++) {
        sum += i*j;
      }
    }
    
    for(int i=1; i<=9; i++) {
      for(int j=1; j<=9; j++) {
        if(i*j==(sum-n))
          System.out.println(i + " x " + j);
      }
    }
  }
}