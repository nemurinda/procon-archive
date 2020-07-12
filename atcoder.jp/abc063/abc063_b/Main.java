import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    String[] s = str.split("");
    Set<String> st = new HashSet<>();
    for(int i=0; i<str.length(); i++) {
      st.add(s[i]);
    }
    System.out.println(str.length()==st.size()?"yes":"no");
  }
}