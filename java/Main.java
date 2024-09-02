// 問題 4: クラスの定義とオブジェクト生成
// Carクラスを定義し、maker（メーカー）とmodel（モデル）の属性を持たせ、それらを表示するdisplayInfoメソッドを作成してください。
// さらに、このクラスからオブジェクトを生成して、displayInfoメソッドを呼び出してみてください。

public class Main {
  public static void main(String[] args) {
    Car car = new Car("TOYOTA", "ROOMY");
    car.displayInfo();
  }
}

class Car {
  String maker;
  String model;

  public Car(String maker, String model) {
    this.maker = maker;
    this.model = model;
  }

  public void displayInfo(){
    System.out.println(String.format("メーカー: %s\nモデル: %s", maker, model));
  }
}
