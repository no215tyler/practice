// 問題 10: 基本的な例外処理
// 					ユーザーに数値を入力してもらい、10をその数値で割った結果を表示するプログラムを作成してください。
// 					ただし、0で割ろうとした場合は、エラーメッセージを表示してください。
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("数値を入力してください");
      int N = sc.nextInt();

      try {
        int result = 10 / N;
        System.out.println(String.format("徐算結果: %s", result));
      } catch (ArithmeticException e) {
        System.out.println("エラー / 0で割ることはできません: " + e.getMessage());
      }

      sc.close();
    }
}