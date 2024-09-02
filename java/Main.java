// 問題 5: コンストラクタの利用
// Bookクラスを定義し、タイトルと著者を持つオブジェクトを生成できるようにコンストラクタを定義してください。
// さらに、describeメソッドでその本の情報を表示するようにしてください。

public class Main {
  public static void main(String[] args) {
    Book book = new Book("リーダブルコード", "O.REILLY");
    book.describe();
  }
}

class Book {
  String title;
  String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public void describe() {
    System.out.println(String.format("本のタイトル: %s\n著者: %s", title, author));
  }
}
