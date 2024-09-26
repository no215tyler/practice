import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int N = input[0];
    int M = input[1];

    List<Integer> seat = new ArrayList<>(IntStream.rangeClosed(1, N).boxed().collect(Collectors.toList()));

    for (int i = 1; i <= M; i++) {
      int[] line = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      int groupAmount = line[0];
      int seatIndex = line[1];
      takeASeat(seat, groupAmount, seatIndex);
    }

    // seat内の「0 = 着台数」をカウント
    long cnt = seat.stream().filter(s -> s == 0).count();

    // 結果を出力
    System.out.println(cnt);

    sc.close();
  }

  static void takeASeat(List<Integer> seat, int n, int startIndex) {
    // n: ループ回数 = グループの人数
    // startIndex: 着席の開始番号

    // 着席可否をチェックし、着席不可なら処理をスキップ
    if (!takeableSeat(seat, n, startIndex)) {
      for (int i = 0; i < n; i++) {
        int index = (startIndex + i) >= seat.size() ? ((startIndex + i) - seat.size()) : (startIndex + i);
        // 着席可能なら番号をインデックス番号を「0」に変更
        seat.set(index, 0);
      }
    }
  }

  static boolean takeableSeat(List<Integer> seat, int n, int startIndex) {
    boolean flg = false;
    for (int i = 0; i < n; i++) {
      int index = (startIndex + i) >= seat.size() ? ((startIndex + i) - seat.size()) : (startIndex + i);
      if (seat.get(index) == 0) {
        flg = true;
        break;
      }
    }
    return flg;
  }
}