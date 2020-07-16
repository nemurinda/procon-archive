import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String x = in.readLine();
    boolean flg = true;
    for(int i=0; i<x.length()-1; i++) {
      if(!(i!=x.length()-2 && x.substring(i,i+1).equals("c")&&x.substring(i+1,i+2).equals("h"))&&
         !(i!=0 && x.substring(i,i+1).equals("h")&&x.substring(i-1,i).equals("c"))&&
         !x.substring(i,i+1).equals("o")&&
         !x.substring(i,i+1).equals("k")&&
         !x.substring(i,i+1).equals("u")) {
        flg = false;
        break;
      }
    }
    System.out.println(flg==true?"YES":"NO");
  }
}