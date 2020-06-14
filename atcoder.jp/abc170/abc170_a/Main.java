import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int[] x = new int[5];
    for(int i=0; i<5; i++) {
      x[i] = Integer.parseInt(str[i]);
      if(x[i]==0){
        System.out.println(i+1);
        break;
      }
    }
  }
}