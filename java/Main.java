// # 問題 7: 配列内の重複を排除して新しい配列を作成する
// 整数の配列が与えられます。その中の重複した要素を排除して、新しい配列を作成してください。

// 例
// 入力: {1, 2, 2, 3, 4, 4, 5}
// 出力: {1, 2, 3, 4, 5}

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      try {
        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();
        int[] result = Arrays.stream(nums).distinct().toArray();
        System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(", ")));

      } catch (NumberFormatException e) {
        System.out.println("不正な入力が含まれています" + e.getMessage());
      }

      sc.close();
    }
}

// 【フィードバック】
// 改善点:
// エラーメッセージの改善:
// エラーメッセージが「不正な入力が含まれています」としていますが、具体的にどの入力が原因なのかを知らせると、ユーザーにとって親切です。また、メッセージにスペースを追加することで、表示が少し見やすくなるでしょう。
// try-catchの適用範囲:
// try-catchブロックの範囲を、最小限に抑えることができます。例えば、NumberFormatExceptionが起こるのはmapToInt(Integer::parseInt)部分だけなので、その部分を囲うことでエラーの範囲を明確にできます。
// 改善例:
      // String input = sc.nextLine();

      // if (input.isEmpty()) {
      //   System.out.println("入力が空です");
      // } else {
      //   try {
      //     int[] nums = Arrays.stream(input.split(" "))
      //                       .mapToInt(Integer::parseInt)
      //                       .toArray();
      //     int[] result = Arrays.stream(nums).distinct().toArray();
      //     System.out.println(Arrays.stream(result)
      //                              .mapToObj(String::valueOf)
      //                              .collect(Collectors.joining(", ")));

      //   } catch (NumberFormatException e) {
      //     System.out.println("不正な入力が含まれています: " + e.getMessage());
      //   }
      // }

