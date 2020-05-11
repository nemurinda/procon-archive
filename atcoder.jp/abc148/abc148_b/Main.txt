import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = in.readLine().split(" ");
    String[] s = str[0].split("");
    String[] t = str[1].split("");
    String ans = "";
    for (int i=0; i<n; i++){
      ans = ans + (s[i] + t[i]);
    }
    System.out.println(ans);
  }
}