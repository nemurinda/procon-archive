import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int a = Integer.parseInt(str[0]);
    int b = Integer.parseInt(str[1]);
    int c = Integer.parseInt(str[2]);
    int k = Integer.parseInt(str[3]);
    int max = 0;
    
    if(b>=k-a)
      max = Math.min(k,a);
    else
      max = a*1 + (k-a-b)*-1;
    System.out.println(max);
  }
}