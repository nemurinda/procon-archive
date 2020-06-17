import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    for(int i=0; i<=1000; i++) {
      int eight = (int)(i*0.08);
      int ten = (int)(i*0.1);
      if(eight == a && ten == b) {
        System.out.println(i);
        return;
      }
    }
    System.out.println(-1);
  }
}