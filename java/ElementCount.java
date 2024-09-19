import java.util.*;

// HashMapに対するcomputeメソッドの使用例
public class ElementCount {
  public static void elementCount() {
    Scanner sc = new Scanner(System.in);
    // 標準入力から半角スペース区切りで配列化
    String[] strs = sc.nextLine().split(" ");

    // HashMapを定義
    Map<String, Integer> hash = new HashMap<>();
    // キーバリュー形式のリストに対して加工をするメソッド -> compute() を使用する
    for (String str : strs) {
      hash.compute(str, (key, value) -> (value == null) ? 1 : value + 1);
      System.out.println(str);
    }

    // HashMapを出力
    for (Map.Entry<String, Integer> entry : hash.entrySet()) {
      System.out.println(String.format("%s %d", entry.getKey(), entry.getValue()));
    }
  }
}