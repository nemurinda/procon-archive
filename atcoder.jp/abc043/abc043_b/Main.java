import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Deque;
import java.util.ArrayDeque;
 
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
	in.close();
	StringBuilder sb = new StringBuilder();
    
    for(int i=0; i<s.length(); i++) {
       if(s.charAt(i)!='B')
        sb.append(s.charAt(i));
      else if(sb.length()>=1)
        sb.deleteCharAt(sb.length()-1);
    }
    
    System.out.println(sb.toString());
  }
}