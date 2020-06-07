import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int ab = Integer.parseInt(str[0]);
    int bc = Integer.parseInt(str[1]);
    int ca = Integer.parseInt(str[2]);
    if(ab>=bc && ab>=ca)
      System.out.println(bc*ca/2);
    else if(bc>=ab && bc>=ca)
      System.out.println(ab*ca/2);
    else if(ca>=ab && ca>=bc)
      System.out.println(ab*bc/2);
  }
}