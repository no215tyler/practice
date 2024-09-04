import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    for (int i = 1; i <= N; i++) {
      System.out.print(i);
      if (i == N) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }

    for (int i = 1; i <= M; i++) {
      System.out.print(i);
      if (i == M) {
        System.out.println();
      } else {
        System.out.print(" ");
      }
    }

    sc.close();
  }
}