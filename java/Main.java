// 問題 18: Listの使用
// 文字列の`ArrayList`を作成し、いくつかの要素を追加して、順番通りにすべての要素を出力してください。
// また、3番目の要素を削除してから、再度全要素を出力してください。
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e"));

    // リスト要素を全部出力
    list.stream().forEach(System.out::println);

    // 3番目の要素を削除した後、リスト要素を全部出力
    list.remove(2);
    list.stream().forEach(System.out::println);

    sc.close();
  }
}