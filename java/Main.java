// 問題 14: HashSet の使用
// HashSetを使って、ユーザーが入力する整数を格納します。
// 同じ整数が入力された場合は、格納されません。
// すべての整数を表示するプログラムを作成してください。
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int prompt = 0;
      Set<Integer> nums = new HashSet<>();
      Scanner sc = new Scanner(System.in);
      while (prompt != 3) {
        System.out.println("プロンプトを入力してください\n【1】: 追加\n【2】: 表示\n【3】: プログラム終了");
        prompt = Integer.parseInt(sc.nextLine());
        switch (prompt) {
          case 1:
            addNums(nums);
            break;
          case 2:
            putsDisplay(nums);
            break;
        }
      }
      sc.close();
    }

    public static Set<Integer> addNums(Set<Integer> list) {
      System.out.println("数値を入力してください");
      Scanner sc = new Scanner(System.in);
      list.add(sc.nextInt());
      // 配列を昇順ソート
      list.stream().sorted();
      return list;
    }

    public static void putsDisplay(Set<Integer> list) {
      list.stream().forEach(System.out::println);
    }
}

