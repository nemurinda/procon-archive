import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(in.readLine());
    int b = Integer.parseInt(in.readLine());
    int n = Integer.parseInt(in.readLine());
    for(; ; n++){
      if(n%a==0 && n%b==0) {
        System.out.println(n);
        break;
      }
    }
  }
}