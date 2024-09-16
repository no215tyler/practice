// 問題 13: ArrayList の使用
// ユーザーから名前を入力してもらい、それをArrayListに追加していきます。
// その後、リストにある全ての名前を表示するプログラムを作成してください。
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int prompt = 0;
      List<String> users = new ArrayList<>();
      Scanner sc = new Scanner(System.in);
      while (prompt != 3) {
        System.out.println("プロンプトを入力してください\n【1】: ユーザー追加\n【2】: ユーザー表示\n【3】: プログラム終了");
        prompt = Integer.parseInt(sc.nextLine());
        switch (prompt) {
          case 1:
            addUser(users);
            break;
          case 2:
            putsDisplay(users);
            break;
        }
      }
      sc.close();
    }

    public static List<String> addUser(List<String> list) {
      System.out.println("ユーザー名を入力してください");
      Scanner sc = new Scanner(System.in);
      list.add(sc.nextLine());
      return list;
    }

    public static void putsDisplay(List<String> list) {
      for (int i = 1; i <= list.size(); i++) {
        System.out.println(String.format("userid %d: %s", i, list.get(i - 1)));
      }
    }
}

