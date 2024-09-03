// 問題 8: インターフェースの実装
// Drawableというインターフェースを定義し、drawというメソッドを含めます。
// そして、このインターフェースを実装するCircleクラスを作成し、drawメソッドで円を描くメッセージを表示してください。
interface Drawable {
  void draw();
}

class Circle {
  public void draw() {
    System.out.println("円を描きます");
  }
}

public class Main {
  public static void main(String[] args) {
    Circle circle = new Circle();
    circle.draw();
  }
}