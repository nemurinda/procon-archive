import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int m = Integer.parseInt(in.readLine());
    if(m<100)
      System.out.println("00");
    else if(m<=5000)
      if(m<1000)
        System.out.println("0" + m/100);
      else
        System.out.println(m/100);
    else if(m<=30000)
      System.out.println(m/1000+50);
    else if(m<=70000)
      System.out.println((m/1000-30)/5+80);
    else
      System.out.println(89);
  }
}