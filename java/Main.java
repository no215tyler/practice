// 問題 7: 継承の活用
// Personクラスを作成し、名前と年齢を持つようにします。
// このクラスを親クラスとしてStudentクラスを作成し、学年を追加してください。
// また、introduceメソッドをオーバーライドし、"私は◯◯です。◯年生です。"と表示するようにしてください。
class Parson {
  String name;
  int age;

  public Parson(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void introduce() {
    System.out.println(String.format("私は%sです。%d歳です。", name, age));
  }
}

class Student extends Parson {
  int grade;

  public Student(String name, int age, int grade) {
    super(name, age);
    this.grade = grade;
  }
  @Override
  public void introduce() {
    System.out.println(String.format("私は%sです。%d年生です。", name, grade));
  }
}

public class Main {
  public static void main(String[] args) {
    Student student = new Student("piko", 13, 1);
    student.introduce();
  }
}