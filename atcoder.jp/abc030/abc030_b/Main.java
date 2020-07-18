import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);

    if(n>=12)
      n -= 12;

    double angle = Math.abs((n*30+m*0.5)-m*6);
    
    System.out.println(angle>180?360-angle:angle);
  }
}