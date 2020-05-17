import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] str = in.readLine().split(" ");
    int n = Integer.parseInt(str[0]);
    int m = Integer.parseInt(str[1]);

    int[] k = new int[m];
    ArrayList<ArrayList<Integer>> list = new ArrayList<>();
    for(int i = 0; i<m; i++) {
      list.add(new ArrayList<>());
   }
    
    for(int i = 0; i<m; i++) {
      str = in.readLine().split(" ");
      k[i] = Integer.parseInt(str[0]);
      for(int j = 1; j<=k[i]; j++) {
        list.get(i).add(Integer.parseInt(str[j]));
      }
    }
    
    int p[] = new int[m];
    str = in.readLine().split(" ");
    for(int i = 0; i<m; i++){
      p[i] = Integer.parseInt(str[i]);
    }
    
    List<String> com = conbination(Arrays.asList(""),n);
    
    int ans = 0;
    for(int i = 0; i<com.size(); i++) {
      String swit[] = com.get(i).split("");
      boolean flag = false;
      
      for(int j = 0; j<m; j++) {
        int count = 0;
        for(int l = 0; l <k[j]; l++) {
          if(swit[list.get(j).get(l) - 1].equals("1")) {
            count++;
          }
        }
        
        if(p[j] == 0) {
          if(count % 2 ==0) {
          } else {
             flag = true;
          }
        } else {
          if(count % 2 ==0) {
            flag = true;
          }
        }
        if(flag) {
          break;
        }
      }
      if(!flag)
        ans++;
    }
    System.out.println(ans);
  }
  
  public static List<String> conbination(List<String> binary, int count) {
    if(count <= 0)
      return binary;
    List<String> list = new ArrayList<String>(binary.size() *2);
    for(String s : binary) {
      list.add(s+0);
      list.add(s+1);
    }
    return conbination(list,count-1);
  } 
}