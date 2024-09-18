// 検索ワード W が以前に入力されたことがある場合：
// 履歴中の W を削除する。
// 履歴の先頭に W を追加する。
// 検索ワード W が以前に入力されたことがない場合：
// 履歴の先頭に W を追加する。
import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      List<String> list = new ArrayList<>();

      int N = Integer.parseInt(sc.nextLine());

      for (int i = 0; i < N; i++) {
        String input = sc.nextLine();
        // inputがlist内にあるかチェック
        int index = list.indexOf(input);
        if (index == -1) {
          // list内になければ先頭に追加
          list.add(0, input);
        } else {
          // 【1】list内にあれば要素を削除
          list.remove(index);
          // 【2】先頭に要素を追加
          list.add(0, input);
        }
      }
      list.stream().forEach(System.out::println);

      sc.close();
    }
}