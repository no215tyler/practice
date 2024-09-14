// 問題 11: 配列内の特定の数値の出現回数を数える
// 整数の配列と特定の数値が与えられます。その数値が配列内に何回出現しているかを数えてください。

// 例 入力: 配列: {1, 2, 3, 1, 2, 1}, 数値: 1
// 出力: 3

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("配列に代入する数値を半角スペース区切りで入力してください");
      String input = sc.nextLine();
      System.out.println("カウントする数値を指定してください");
      int targetNum = sc.nextInt();


      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          long result = Arrays.stream(nums).filter(n -> n == targetNum)
                                          .count();
          System.out.println(result);

        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}