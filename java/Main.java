import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] NKP = Arrays.stream(sc.nextLine().split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();
    int N = NKP[0]; // 人数（配列内の要素数）
    int K = NKP[1]; // イベント回数
    int P = NKP[2]; // paiza君の身長

    List<Integer> list = new ArrayList<>(Arrays.asList(P));

    for (int i = 0; i < N; i++) {
      list.add(Integer.parseInt(sc.nextLine()));
    }

    for (int i = 0; i < K; i++) {
      String[] input = sc.nextLine().split(" ");
      String query = input[0];

      // 追加
      if (query.equals("join")) {
        int height = Integer.parseInt(input[1]);
        join(list, height);

      // 並べ替え
      } else if (query.equals("sorting")) {
        sorting(list, P);
      } else {
        System.out.println("エラー: 予期せぬ挙動");
      }
    }

    sc.close();
  }

  static void join(List<Integer> list, int height) {
    list.add(height);
  }

  static void sorting(List<Integer> list, int P) {
    Collections.sort(list);
    int index = list.indexOf(P) + 1;
    System.out.println(index);
  }
}