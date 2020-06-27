import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(in.readLine());
    int b = Integer.parseInt(in.readLine());
    int c = Integer.parseInt(in.readLine());
    int max = Math.max(a,Math.max(b,c));
    int min = Math.min(a,Math.min(b,c));
    if(a==max)
      System.out.println(1);
    else if(a==min)
      System.out.println(3);
    else
      System.out.println(2);

    if(b==max)
      System.out.println(1);
    else if(b==min)
      System.out.println(3);
    else
      System.out.println(2);

    if(c==max)
      System.out.println(1);
    else if(c==min)
      System.out.println(3);
    else
      System.out.println(2);
  }
}
   