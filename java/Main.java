import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int halfNum = N / 2;
    for (int i = 1; i <= halfNum; i++) {
      if (i == halfNum) {
        System.out.println(i);
      } else {
        System.out.print(i + " ");
      }
    }
    for (int i = (halfNum + 1); i <= N; i++) {
      if (i == N) {
        System.out.println(i);
      } else {
        System.out.print(i + " ");
      }
    }

    sc.close();
  }
}