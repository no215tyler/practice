import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    for (int i = 0; i < N; i++) {
      int num = sc.nextInt();
      System.out.println(String.format("%" + M + "d", num));
    }

    sc.close();
  }
}
