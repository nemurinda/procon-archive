import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    int str_len = str.length();
    
    if(Integer.parseInt(str.substring(str_len-1,str_len))==3)
      System.out.println("bon");
    else if(Integer.parseInt(str.substring(str_len-1,str_len))==0 ||
            Integer.parseInt(str.substring(str_len-1,str_len))==1 ||
            Integer.parseInt(str.substring(str_len-1,str_len))==6 ||
            Integer.parseInt(str.substring(str_len-1,str_len))==8)
      System.out.println("pon");
    else
      System.out.println("hon");
  }
}