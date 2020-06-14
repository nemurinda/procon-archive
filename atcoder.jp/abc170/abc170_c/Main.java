import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int x = Integer.parseInt(str[0]);
    int n = Integer.parseInt(str[1]);
    str = in.readLine().split(" ");
    Set<Integer> set = new HashSet<>();
    for(int i=0; i<n; i++) {
      set.add(Integer.parseInt(str[i]));
    }
    for(int i=0; i<=200; i++) {
      if(!set.contains(x-i)) {
        System.out.println(x-i);
        return;
      }
      if(!set.contains(x+i)) {
        System.out.println(x+i);
        return;
      }
    }
  }
}