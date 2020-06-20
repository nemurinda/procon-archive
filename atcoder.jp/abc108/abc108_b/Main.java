import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int x1 = Integer.parseInt(str[0]);
    int y1 = Integer.parseInt(str[1]);
    int x2 = Integer.parseInt(str[2]);
    int y2 = Integer.parseInt(str[3]);
    
    int x = x2-x1;
    int y = y2-y1;
    
    System.out.println(String.format("%d %d %d %d",x2-y, y2+x, x1-y, y1+x));
  }
}