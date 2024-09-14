// 問題 14: 配列の合計値が特定の数値以上かどうかを確認する
// 整数の配列と特定の数値が与えられます。配列内のすべての要素の合計が、特定の数値以上であるかどうかを確認してください。

// 例 入力: 配列: {10, 20, 30}, 数値: 50
// 出力: true

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("配列に代入する数値を半角スペース区切りで入力してください");
      String input = sc.nextLine();
      System.out.println("しきい値を入力してください");
      int threshold = Integer.parseInt(sc.nextLine());

      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          int sumResult = Arrays.stream(nums).sum();
          if (sumResult >= threshold) {
            System.out.println(true);
          } else {
            System.out.println(false);
          }

        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}

// 【フィードバック】
// 改善の余地:
// Booleanの出力: 合計がしきい値以上の場合に true を表示し、それ以外は false を表示していますが、
// より簡潔に System.out.println(sumResult >= threshold); とすることが可能です。