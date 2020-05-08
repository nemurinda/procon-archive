import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);
    String[] hw_days = in.readLine().split(" ");
    int sum = 0;
    for(int i=0; i<m; i++){
      sum += Integer.parseInt(hw_days[i]);
    }
    System.out.println(n-sum >= 0?n-sum:-1);
  }
}