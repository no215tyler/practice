// 問題 16: 配列の範囲外アクセス
// 次のプログラムでは、配列に対して範囲外のインデックスにアクセスしようとしています。
// 例外処理を使って、エラーをキャッチし、適切なメッセージを表示するように修正してください。
import java.util.*;

public class Main {
  public static void main(String[] args) {
      int[] numbers = {1, 2, 3};
      try {
        System.out.println(numbers[3]); // ここで例外が発生
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("【エラー】範囲外にアクセスしようとしています: " + e.getMessage());
      }
  }
}