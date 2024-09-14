// # 問題 9: 配列内の要素の平均を求める
// 整数の配列が与えられます。その配列の平均値を求めてください。小数点も含めた値で出力してください。

// 例 入力: {10, 20, 30, 40, 50}
// 出力: 30.0

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();

      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          OptionalDouble average = Arrays.stream(nums).average();
          // 値が存在しない場合はデフォルト値 0.0 を返す（nullチェック）
          double result = average.orElse(0.0);
          System.out.println(result);
        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}