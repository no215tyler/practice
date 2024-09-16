// 問題 15: HashMap の使用
// ユーザーに国名とその首都名を入力してもらい、それをHashMapに保存します。
// すべての国と首都名のペアを表示するプログラムを作成してください。
import java.util.*;

public class Main {
    public static void main(String[] args) {
      int prompt = 0;
      Map<String, String> lists = new HashMap<>();
      Scanner sc = new Scanner(System.in);
      while (prompt != 3) {
        System.out.println("プロンプトを入力してください\n【1】: 国名&首都を追加\n【2】: 一覧表示\n【3】: プログラム終了");
        prompt = Integer.parseInt(sc.nextLine());
        switch (prompt) {
          case 1:
            addCountry(lists);
            break;
          case 2:
            putsDisplay(lists);
            break;
        }
      }
      sc.close();
    }

    public static Map<String, String> addCountry(Map<String, String> list) {
      Scanner sc = new Scanner(System.in);
      System.out.println("国名を入力してください");
      String country = sc.nextLine();
      System.out.println(String.format("%sの首都を入力してください", country));
      String capitalCities = sc.nextLine();
      list.put(country, capitalCities);
      return list;
    }

    public static void putsDisplay(Map<String, String> list) {
      for (Map.Entry<String, String> entry : list.entrySet()) {
        System.out.println(String.format("%sの首都: %s", entry.getKey(), entry.getValue()));
      }
    }
}

