import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    int[] p = new int[n];
    int count = 0;
    String[] str = in.readLine().split(" ");
    for(int i=0; i<n; i++) {
      p[i] = Integer.parseInt(str[i]);
      if(p[i] != i+1)
        count++;
    }
    System.out.println(count<=2?"YES":"NO");
  }
}