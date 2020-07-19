import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] s = new String[n];
    Map<String, Integer> map = new HashMap<>();
    for(int i=0; i<n; i++) {
      s[i] = in.readLine();
      if(map.containsKey(s[i]))
        map.put(s[i],map.get(s[i])+1);
      else
        map.put(s[i],1);
    }
    
    in.close();
    
    String ans = null;
    int max = 0;
    for(String key : map.keySet()) {
      int val = map.get(key);
      if(val>max) {
        max = val;
        ans = key;
      }
    }

    System.out.println(ans);
  }
}