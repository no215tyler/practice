import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    Map<String, Integer> hash = new HashMap<>();

    for (int i = 0; i < N; i++) {
      String[] input = sc.nextLine().split(" ");
      hash.merge(input[0], Integer.parseInt(input[1]), Integer::sum);
    }

    // HashMapをリストに変換
    List<Map.Entry<String, Integer>> list = new ArrayList<>(hash.entrySet());

    // 降順ソート
    Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
      @Override
      public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue().compareTo(o1.getValue());
      }
    });

    // 出力処理
    for (Map.Entry<String, Integer> entry : list) {
      System.out.println(String.format("%s %d", entry.getKey(), entry.getValue()));
    }

    sc.close();
  }
}