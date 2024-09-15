// 問題 11: 複数の例外のキャッチ
// 					配列の要素を表示するプログラムを作成し、配列の範囲外にアクセスしようとした場合と、
//          数値を0で割ろうとした場合の両方を例外としてキャッチして処理してください。
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("半角スペース区切りで数値を入力してください");
      int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      System.out.println("配列要素に対して割る数値を入力してください");
      int N = sc.nextInt();

      try {
        for (int i = 0; i < nums.length; i++) {
          int result = nums[i] / N;
          System.out.println(String.format("徐算結果: %s", result));
        }
      } catch (ArithmeticException e) {
        System.out.println("エラー / 0で割ることはできません: " + e.getMessage());
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("エラー / 配列外のインデックスは参照できません" + e.getMessage());
      }

      sc.close();
    }
}