// 問題 15: 配列内の全要素を特定の数値で割った余りを計算して新しい配列を作成する
// 整数の配列と特定の数値が与えられます。その配列内の全要素を特定の数値で割った余りを計算し、新しい配列を作成してください。

// 例 入力: 配列: {10, 20, 30}, 数値: 3
// 出力: {1, 2, 0}

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("配列に代入する数値を半角スペース区切りで入力してください");
      String input = sc.nextLine();
      System.out.println("割り算する数値を入力してください");
      int N = Integer.parseInt(sc.nextLine());

      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          var result = Arrays.stream(nums).map(n -> n % N).mapToObj(String::valueOf).collect(Collectors.joining(", "));
          System.out.println(result);


        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        } catch (ArithmeticException e) {
          System.out.println("0で割ることはできません / エラーメッセージ: " + e.getMessage());
        }
      }

      sc.close();
    }
}