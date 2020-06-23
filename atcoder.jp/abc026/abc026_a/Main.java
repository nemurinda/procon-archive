import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(in.readLine());
    int max = 0;
    for(int i=1; i<a; i++) {
      max = Math.max(max,i*(a-i));
    }
    System.out.println(max);
  }
}