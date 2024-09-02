import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String[] strArray = sc.nextLine().split(",");
    for (String str : strArray) {
      System.out.println(str);
    }
  }
}