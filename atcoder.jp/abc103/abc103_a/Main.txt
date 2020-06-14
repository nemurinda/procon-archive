import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] a_str = in.readLine().split(" ");
    int[] a = new int[3];
    a[0] = Integer.parseInt(a_str[0]);
    a[1] = Integer.parseInt(a_str[1]);
    a[2] = Integer.parseInt(a_str[2]);
    int min = Math.min(Math.min(a[0],a[1]),a[2]);
    int sum = a[0] + a[1] + a[2];
    int max = Math.max(Math.max(a[0],a[1]),a[2]);
    System.out.println(max-(sum-min-max) + (sum-min-max)-min);
  }
}