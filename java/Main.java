// 問題 4: 配列内の最小値と最大値を求める
// 整数の配列が与えられます。その中の最小値と最大値をそれぞれ求めてください。

// 例
// 入力: {5, 9, 2, 4, 7, 3}
// 出力: 最小値: 2, 最大値: 9

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int min = Arrays.stream(nums).min().getAsInt();
      int max = Arrays.stream(nums).max().getAsInt();

      System.out.println(String.format("最小値: %d 最大値: %d", min, max));

      sc.close();
    }
}
