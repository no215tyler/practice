import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = sc.nextLine().split(" ");
    int N = Integer.parseInt(strNums[0]);
    String A = strNums[1];
    String B = strNums[2];

    for (int i = 0; i < N; i++) {
      System.out.print(String.format("(%s, %S)", A, B));
      if (i == N - 1) {
        System.out.println();
      } else {
        System.out.print(", ");
      }
    }

    sc.close();
  }
}
