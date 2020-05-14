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
    int x = Integer.parseInt(str[3]);
    int y = Integer.parseInt(str[4]);
    int sum = 0;
    int ans = a*x+b*y;
    
    for(int i=0; i<=2*Math.max(x,y)+2; i+=2){
      sum = Math.max(0,(x-i/2))*a+Math.max(0,(y-i/2))*b+i*c;
      ans = Math.min(ans,sum);
    }
    
    System.out.println(ans);
  }
}