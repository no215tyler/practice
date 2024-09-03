import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strs = new String[10];
    for (int i = 0; i < 10; i++) {
      strs[i] = sc.next();
    }
    String result = String.join(" ", strs);
    System.out.println(result);
    sc.close();
  }
}