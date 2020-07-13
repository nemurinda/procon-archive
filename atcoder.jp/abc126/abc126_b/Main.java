import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int s_former = Integer.parseInt(s.substring(0,2));
    int s_latter = Integer.parseInt(s.substring(2,4));
    if((s_former>=1 && s_former<=12) && (s_latter>=1 && s_latter<=12))
      System.out.println("AMBIGUOUS");
    else if(s_former>=1 && s_former<=12)
      System.out.println("MMYY");
    else if(s_latter>=1 && s_latter<=12)
      System.out.println("YYMM");
    else
      System.out.println("NA");
  }
}