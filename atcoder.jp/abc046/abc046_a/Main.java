import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    Set<String> st = new HashSet<String>();
    st.add(str[0]);
    st.add(str[1]);
    st.add(str[2]);
    System.out.println(st.size());
  }
}