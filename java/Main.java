// 問題 16: 配列内のすべての要素が指定された範囲内かどうかを確認する
// 整数の配列と範囲を示す2つの数値（最小値と最大値）が与えられます。配列内のすべての要素がその範囲内にあるかどうかを確認してください。

// 例 入力: 配列: {1, 2, 3, 4, 5}, 範囲: 1 から 5
// 出力: true

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("配列に代入する数値を半角スペース区切りで入力してください");
      String input = sc.nextLine();
      System.out.println("範囲の数値を半角スペース区切りで入力してください");
      String[] range = sc.nextLine().split(" ");

      if (input.isEmpty() || range.length == 0) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          int min = Integer.parseInt(range[0]);
          int max = Integer.parseInt(range[1]);

          boolean result = Arrays.stream(nums).allMatch(n -> (n >= min) && (n <= max));
          System.out.println(result);


        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}

// 【フィードバック】
// 改善案:
// 範囲の入力を2つの数値であることを明示: 範囲の入力が2つの数値であることを厳密にチェックする。
// String[] range = sc.nextLine().split(" ");

//       if (input.isEmpty()) {
//         System.out.println("配列が空です");
//       } else if (range.length != 2) {
//         System.out.println("範囲の数値は2つ入力してください");
//       } else {...