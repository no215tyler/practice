// 問題 9: 複数のインターフェースの実装
// SwimmableとRunnableという2つのインターフェースを作成し、それぞれswimとrunというメソッドを持たせます。
// そして、これらのインターフェースを実装するAthleteクラスを作成し、swimとrunメソッドでそれぞれのアクションを表示してください。

interface Swimmable {
  void swim();
}

interface Runnable {
  void run();
}

class Athlete {
  public void swim() {
    System.out.println("泳ぎます");
  }

  public void run() {
    System.out.println("走ります");
  }
}

public class Main {
  public static void main(String[] args) {
    Athlete athlete = new Athlete();
    athlete.swim();
    athlete.run();
  }
}