import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = new String[10];
    for (int i = 0; i < 10; i++) {
      strNums[i] = sc.next();
    }
    String result = String.join(" | ", strNums);
    System.out.println(result);
    sc.close();
  }
}