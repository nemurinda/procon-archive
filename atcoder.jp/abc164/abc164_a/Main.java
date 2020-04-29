import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String[] array = in.readLine().split(" ");
    int S = Integer.parseInt(array[0]);
    int W = Integer.parseInt(array[1]);
    System.out.println(S>W?"safe":"unsafe");
  }
}

