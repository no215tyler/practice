// 問題 12: 独自の例外の定義
// NegativeValueExceptionという独自の例外を定義し、ユーザーに入力された値が負の場合にその例外をスローするメソッドを作成してください。
// 入力された値が正の場合は、その値を表示するようにしてください。
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("数値を入力してください");
      int N = sc.nextInt();

      try {
        putsDisplay(N);
      } catch (NegativeValueException e) {
        System.out.println(e.getMessage());
      }

      sc.close();
    }

    public static void putsDisplay(int n) throws NegativeValueException {
      if (n < 0) {
        throw new NegativeValueException("入力エラー: 負の数が入力されました。正の数を入力してください。");
      }
      System.out.println(n);
    }
}

class NegativeValueException extends Exception {
  public NegativeValueException(String message) {
    super(message);
  }
}