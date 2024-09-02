// 演習問題
// 問題 1: 基本的な変数の定義
// 年齢、名前、学生かどうかを表す変数を定義し、それらを出力するJavaプログラムを作成してください。
class Main {
  public static void main(String[] args) {
    int age = 23;
    String name = "Jhon";
    boolean isStudent = false;
    if (isStudent) {
      String output = String.format("%d歳の%sです。学生です。", age, name);
      System.out.println(output);
    } else {
      String output = String.format("%d歳の%sです。学生ではありません。", age, name);
      System.out.println(output);
    }
  }
}