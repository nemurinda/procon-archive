import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    String ary = "ABCDEF";
    int[] count = new int[6];
    for(int i=0; i<s.length(); i++) {
      for(int j=0; j<6; j++) {
        if(s.charAt(i)==ary.charAt(j))
          count[j]++;
      }
    }
    for(int i=0; i<6; i++) {
      System.out.print(count[i]);
      if(i!=5)
         System.out.print(" ");
      else
        System.out.println();
    }
  }
}