import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int num = Integer.parseInt(sc.nextLine());
    System.out.println(String.format("%" + N + "d", num));
    sc.close();
  }
}