// 問題 3: 条件分岐
// 引数として渡された数値が偶数か奇数かを判定し、偶数なら「Even」、奇数なら「Odd」と出力するメソッドcheckEvenOddを作成してください。
class Main {
  public static void main(String[] args) {
    System.out.println(checkEvenOdd(64));
    System.out.println(checkEvenOdd(303));
  }

  public static String checkEvenOdd(int num) {
    if (num % 2 == 0) {
      return "Even";
    } else {
      return "Odd";
    }
  }
}