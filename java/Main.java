// 問題 6: オブジェクトのメソッド呼び出し
// Studentクラスを定義し、名前と学年を持つオブジェクトを生成し、introduceメソッドで
// 「私は◯◯です。◯年生です。」と表示するようにしてください。

public class Main {
  public static void main(String[] args) {
    Student student = new Student("Elena", 4);
    student.introduce();
  }
}

class Student {
  String name;
  int schoolGrade;

  public Student(String name, int schoolGrade) {
    this.name = name;
    this.schoolGrade = schoolGrade;
  }

  public void introduce() {
    System.out.println(String.format("私は%sです。%d年生です。", name, schoolGrade));
  }
}