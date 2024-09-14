// 問題 13: 配列内の偶数だけを抽出して新しい配列を作成する
// 整数の配列が与えられます。その中から偶数だけを抽出し、新しい配列を作成してください。

// 例 入力: {1, 2, 3, 4, 5, 6}
// 出力: {2, 4, 6}

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
                      .filter(n -> n % 2 == 0)
                      .toArray();

          String result = Arrays.stream(nums)
                                .mapToObj(String::valueOf)
                                .collect(Collectors.joining(", "));

          System.out.println(result);

        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}

// 【フィードバック】
// 改善の余地:
// 結果が空の場合の処理: 偶数が一つもなかった場合、Arrays.stream(nums)は空の配列になります。その場合もカンマ区切りの結果が空の文字列で表示されるため、ユーザーに「偶数がありません」というメッセージを表示したほうが親切です。
// 追加メッセージの表示: 出力結果だけではなく、「抽出された偶数: 」などのメッセージを付け加えると、結果がさらに分かりやすくなります。
// 改善案:
// java
// コードをコピーする

          // int[] nums = Arrays.stream(input.split(" "))
          //             .mapToInt(Integer::parseInt)
          //             .filter(n -> n % 2 == 0)
          //             .toArray();

          // if (nums.length == 0) {
          //   System.out.println("偶数はありません");
          // } else {
          //   String result = Arrays.stream(nums)
          //                         .mapToObj(String::valueOf)
          //                         .collect(Collectors.joining(", "));
          //   System.out.println("抽出された偶数: " + result);
          // }
