import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args)throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] str = new String[n];
    Set<String> set = new HashSet<>();
    int count = 0;
    for(int i=0; i<n; i++) {
      set.add(in.readLine());
    }
    System.out.println(set.size());
  }
}