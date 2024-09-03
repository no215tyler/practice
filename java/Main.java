import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = new String[1000];
    for (int i = 0; i < 1000; i++) {
        strNums[i] = "" + (i + 1);
    }
    String result = String.join(" ", strNums);
    System.out.println(result);
    sc.close();
  }
}