import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.Set;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    Set st = new TreeSet();
    for(int i=0; i<n; i++) {
      st.add(Integer.parseInt(in.readLine()));
    }
    in.close();
    
    Iterator it = st.iterator();
    int sz = st.size();
    for(int i=0; i<(sz-2); i++) {
      it.next();
    }
    System.out.println(it.next());
  }
}
  