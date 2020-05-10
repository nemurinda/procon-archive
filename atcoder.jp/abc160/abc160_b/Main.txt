import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int x = Integer.parseInt(in.readLine());
    int ans_500 = x/500*1000;
    int ans_5 = (x%500)/5*5;
    System.out.println(ans_500 + ans_5);
  }
}