// 問題 12: 配列内の要素を全て文字列に変換し、カンマ区切りで連結する
// 整数の配列が与えられます。その配列の各要素を文字列に変換し、カンマ区切りで連結して1つの文字列として出力してください。

// 例 入力: {1, 2, 3, 4, 5}
// 出力: 1, 2, 3, 4, 5

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("配列に代入する数値を半角スペース区切りで入力してください");
      String input = sc.nextLine();

      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          System.out.println(Arrays.stream(nums)
                                    .mapToObj(String::valueOf)
                                    .collect(Collectors.joining(", ")));

        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}