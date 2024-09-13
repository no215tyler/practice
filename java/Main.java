// 問題 3: 各要素を2倍にして新しい配列を作る
// 整数の配列が与えられます。各要素を2倍にした新しい配列を作成してください。

// 例
// 入力: {1, 2, 3, 4, 5}
// 出力: {2, 4, 6, 8, 10}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int[] multiplyNums = Arrays.stream(nums).map(n -> n * 2).toArray();

      for (int i = 0; i < multiplyNums.length; i++) {
        System.out.print(multiplyNums[i]);
        if (i == multiplyNums.length - 1) {
          System.out.println();
        } else {
          System.out.print(", ");
        }
      }

      sc.close();
    }
}

// 【フィードバック】
// 改善点:
// forループでの出力処理:
// forループ内でカンマ区切りの処理を行っていますが、これはString.joinやCollectors.joiningといったメソッドを使うことでより簡潔に記述できます。
// 例としてCollectors.joining(", ")を使うと、カンマ区切りの処理がループを使わずに済みます。

// String result = Arrays.stream(nums)
//                       .map(n -> n * 2)
//                       .mapToObj(String::valueOf)
//                       .collect(Collectors.joining(", "));

