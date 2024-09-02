// 問題 2: メソッドの定義
// 引数として渡された数値を2倍にして返すメソッドdoubleValueを作成し、そのメソッドを使って値を2倍にして出力してください。
class Main {
  public static void main(String[] args) {
    System.out.println(doubleValue(10));
  }

  public static Integer doubleValue(int num) {
    return num * 2;
  }
}