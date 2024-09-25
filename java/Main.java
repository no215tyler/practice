// 問題 19: Setの使用
// `HashSet`を使って、ユーザーが入力した数値の中から重複しない数値を保存し、その後にすべてのユニークな数値を出力するプログラムを作成してください。
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Set<Integer> setMaps = new HashSet<>();
    for (int i = 1; i <= 10; i++) {
      System.out.println(String.format("%d 回目入力待ち/10回中", i));
      setMaps.add(sc.nextInt());
    }

    setMaps.stream().sorted().forEach(System.out::println);

    sc.close();
  }
}