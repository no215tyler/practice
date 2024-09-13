// 問題 8: 配列内の奇数をすべて3倍にして新しい配列を作る
// 整数の配列が与えられます。配列の中の奇数のみを3倍にして、新しい配列を作成してください。

// 例
// 入力: {1, 2, 3, 4, 5}
// 出力: {3, 2, 9, 4, 15}

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();

      if (input.isEmpty()) {
        System.out.println("入力が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                            .mapToInt(Integer::parseInt)
                            .map(n -> (n % 2 == 1) ? (n * 3) : n)
                            .toArray();

          System.out.println(Arrays.stream(nums)
                            .mapToObj(String::valueOf)
                            .collect(Collectors.joining(", ")));

        } catch (NumberFormatException e) {
          System.out.println("不正な入力が含まれています " + e.getMessage());
        }
      }

      sc.close();
    }
}