import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(sc.nextLine());
      System.out.println(String.format("%3d", num));
    }
    sc.close();
  }
}
