import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strs = sc.nextLine().split(" ");
    for (String str : strs) {
      System.out.println(str);
    }
    sc.close();
  }
}