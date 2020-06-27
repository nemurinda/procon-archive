import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = new String[2];
    int sum = 0;
    for(int i=0; i<3; i++) {
      str = in.readLine().split(" ");
      sum += Integer.parseInt(str[0])*Integer.parseInt(str[1])/10;
    }
    System.out.println(sum);
  }
}