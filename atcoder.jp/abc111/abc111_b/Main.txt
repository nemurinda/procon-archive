import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    for(int i=111; i<=999; i=i+111) {
      if(i>=n){
        System.out.println(i);
        break;
      }
    }
  }
}
      