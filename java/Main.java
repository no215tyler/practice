import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 初期入力
    int[] inputNums = Arrays.stream(sc.nextLine()
                            .split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

    int base = inputNums[0];

    // メイン処理
    for (int i = 0; i < inputNums[1]; i++) {
      int M = Integer.parseInt(sc.nextLine());
      int upper = (M / base) * base + base;
      int downer = (M / base) * base;

      if (downer == 0 && !isUpper(M, upper, downer)) {
        System.out.println(base);
      } else if (isUpper(M, upper, downer)) {
        System.out.println(upper);
      } else {
        System.out.println(downer);
      }
    }


    sc.close();
  }

  public static boolean isUpper(int M, int upper, int downer) {
    if ((upper - M) <= (M - downer)) {
      return true;
    } else {
      return false;
    }
  }
}