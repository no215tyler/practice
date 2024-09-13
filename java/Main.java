// 【Java Arrays.stream練習問題】
// 問題 1: 偶数の合計を求める
// 整数の配列が与えられます。配列の中から偶数を抽出し、その合計を求めてください。

// 例
// 入力: {1, 2, 3, 4, 5, 6}
// 出力: 12 （2 + 4 + 6）

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String[] inputNums = sc.nextLine().split(" ");
      int[] nums = new int[inputNums.length];

      for (int i = 0; i < inputNums.length; i++) {
        nums[i] = Integer.parseInt(inputNums[i]);
      }

      int result = Arrays.stream(nums).filter(n -> n % 2 == 0).sum();
      System.out.println(result);

      sc.close();
    }
}

// フィードバック
// forループで文字列から整数に変換する方法としてStreamを使ってもっと簡潔に記述する方法
// int[] nums = Arrays.stream(sc.nextLine().split(" "))
//                    .mapToInt(Integer::parseInt)
//                    .toArray();
