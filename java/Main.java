import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] asterisk = new String[n];
    for (int i = 0; i < n; i++) {
      asterisk[i] = "*";
    }
    String result = String.join("", asterisk);
    System.out.println(result);
    sc.close();
  }
}
