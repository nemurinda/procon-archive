import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(in.readLine());
    String[] fizzBuzz = new String[n];
    long sum = 0;
    for(int i = 1; i<=n; i++){
      if(i%3==0 && i%5==0){
//        fizzBuzz[i-1] = "FizzBuzz";
      } else if(i%3==0){
//        fizzBuzz[i-1] = "Fizz";
      } else if(i%5==0){
//        fizzBuzz[i-1] = "Buzz";
      } else {
        sum += (long)i;
      }
    }
    System.out.println(sum);
  }
}