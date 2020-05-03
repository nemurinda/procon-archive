import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int k = Integer.parseInt(in.readLine());
    String str[] = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    in.close();
    int largest = (b/k) * k;
    System.out.println(a<=largest?"OK":"NG");
  }
}