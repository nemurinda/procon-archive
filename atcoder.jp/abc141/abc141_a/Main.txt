import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String str = in.readLine();
    String[] array = new String[3];
    array[0] = "Sunny";
    array[1] = "Cloudy";
    array[2] = "Rainy";
    if(str.equals(array[0]))
      System.out.println(array[1]);
    else if(str.equals(array[1]))
      System.out.println(array[2]);
    else
      System.out.println(array[0]);
  }
}