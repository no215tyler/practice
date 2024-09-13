// # 問題 6: 配列内のすべての要素が正の数かどうかを確認する
// 整数の配列が与えられます。その中のすべての要素が正の数であるかどうかを確認してください。結果は true または false で返します。

// 例
// 入力: {1, 2, 3, 4, 5}
// 出力: true

// 入力: {1, -2, 3, 4, 5}
// 出力: false

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      try {
        int[] nums = Arrays.stream(sc.nextLine().split(" "))
                          .mapToInt(Integer::parseInt)
                          .toArray();

        boolean bool = Arrays.stream(nums).allMatch(num -> num > 0);
        System.out.println(bool);
      } catch (NumberFormatException e) {
        System.out.println("配列が空です" + e.getMessage());
      }

      sc.close();
    }
}

// 【フィードバック】
// 改善点:
// エラーメッセージの適切さ:

// NumberFormatExceptionは、空の配列以外にも不正な入力（例えば数字でない文字が含まれる場合）で発生するため、メッセージを「不正な入力が含まれています」など、もう少し汎用的にする方が望ましいです。
// 空の配列に対して特別に対応する場合は、事前に入力が空かどうかをチェックした方が明確です。
// 不要な例外処理:

// 配列が空であるかどうかは、例外を使わずに事前に判定することが可能です。たとえば、入力文字列が空かどうかをisEmpty()で確認できます。
// 例外処理は基本的に例外的なケースで使用するのが推奨されるため、通常の処理で検出できるエラーは事前に処理しましょう。

      // if (input.isEmpty()) {
      //   System.out.println("入力が空です");
      // } else {
      //   try {
      //     int[] nums = Arrays.stream(input.split(" "))
      //                       .mapToInt(Integer::parseInt)
      //                       .toArray();

      //     boolean bool = Arrays.stream(nums).allMatch(num -> num > 0);
      //     System.out.println(bool);
      //   } catch (NumberFormatException e) {
      //     System.out.println("不正な入力が含まれています: " + e.getMessage());
      //   }
      // }

