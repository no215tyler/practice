// 問題 20: Mapの使用
// フルーツとその価格を格納する`HashMap`を作成し、いくつかのキーと値のペアを追加してください。
// その後、特定のフルーツの価格を取得して出力し、すべてのキーと値のペアをループで出力するプログラムを作成してください。
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Map<String, Integer> fruitsStore = new HashMap<>();

    int query = 1;
    while (query != 0) {
      try {
        System.out.println("【果物名】と【価格】を半角スペース区切りで入力してください");
        String[] input = sc.nextLine().split(" ");
        fruitsStore.put(input[0], Integer.parseInt(input[1]));
        System.out.println("終了する場合は【0】を入力してください");
        query = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException e) {
        // エラーを無視
      }
    }

    // HashMapをリストへ変換し
    List<Map.Entry<String, Integer>> list = new ArrayList<>(fruitsStore.entrySet());
    // 価格順に昇順ソート
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o1.getValue().compareTo(o2.getValue());
      }
    });

    // 出力処理
    for (Map.Entry<String, Integer> entry : list) {
      System.out.println(String.format("%s : %d", entry.getKey(), entry.getValue()));
    }


    sc.close();
  }
}