// 問題 23: Optional
// `getAge()`メソッドを実装し、年齢を取得します。
// この年齢が`null`でない場合は年齢を表示し、`null`の場合は「年齢が未設定です」と表示するプログラムを作成してください。
import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Person> persons = new ArrayList<>();

    for (int i = 0; i < 3; i++) {
      System.out.println("名前と年齢を半角スペース区切りで入力してください");
      String[] input = sc.nextLine().split(" ");
      if (input.length == 2) {
        persons.add(new Person(input[0], Optional.of(Integer.parseInt(input[1]))));
      } else {
        persons.add(new Person(input[0]));
      }
      if (persons.get(i).age == null) {
        System.out.println("年齢が未設定です");
      }
    }
    sc.close();
  }
}

class Person {
  String name;
  Optional<Integer> age = null;

  public Person(String name, Optional<Integer> age) {
    this.name = name;
    this.age = age;
  }

  public Person(String name) {
    this.name = name;
  }
}