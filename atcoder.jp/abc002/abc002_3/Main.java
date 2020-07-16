import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    double xa = Double.parseDouble(str[0]);
    double ya = Double.parseDouble(str[1]);
    double xb = Double.parseDouble(str[2]);
    double yb = Double.parseDouble(str[3]);
    double xc = Double.parseDouble(str[4]);
    double yc = Double.parseDouble(str[5]);
    
    xb -= xa;
    xc -= xa;
    yb -= ya;
    yc -= ya;
    
    System.out.println(Math.abs(xb*yc - yb*xc)/2.0);
  }
}