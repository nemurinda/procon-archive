import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(in.readLine());
    for(int i=1; i<1000; i++) {
      if(Math.pow(i,4)==x) {
        System.out.println(i);
        break;
      }
    }
  }
}