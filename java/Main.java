import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String T = sc.nextLine();
    System.out.println(String.format("%s + %s = %s%s", S, T, S, T));
    sc.close();
  }
}
