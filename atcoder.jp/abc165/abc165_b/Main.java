import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    long X = Long.parseLong(in.readLine());
    long deposit = 100;
    for (long i = 1; ; i++){
      deposit = (long)(deposit * 1.01);
      if(deposit >= X ){
        System.out.println(i);
        break;
      }
    }
  }
}