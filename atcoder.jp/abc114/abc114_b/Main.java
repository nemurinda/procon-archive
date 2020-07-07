import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String s = in.readLine();
    int min = 1000;
    int size = 0;
    if(s.length()%3==0)
      size = s.length()/3*3-2;
    else if(s.length()%3==1)
      size = s.length()/3*3-1;
    else
      size = s.length()/3*3;
    
    for(int i=0; i<size; i = i+1){
      int num = Integer.parseInt(s.substring(i,i+3));
      min = Math.min(min,Math.abs(753-num));
    }
    System.out.println(min);
  }
}