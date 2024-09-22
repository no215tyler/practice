import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] NKQ = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int N = NKQ[0]; // 要素数 = ループ回数
    int index = NKQ[1]; // 配列添字
    int Q = NKQ[2]; // 挿入する数値

    // 動的配列
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(Integer.parseInt(sc.nextLine()));
    }

    // 指定のインデックスへQを挿入
    list.add(index, Q);

    // 出力
    list.stream().forEach(System.out::println);

    sc.close();
  }
}
