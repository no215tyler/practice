import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 盤面マス目の定義
    int[] nums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    int H = nums[0];
    int W = nums[1];

    List<List<String>> boards = new ArrayList<>();

    for (int i = 0; i < H; i++) {
      List<String> line = new ArrayList<>(Arrays.stream(sc.nextLine().split("")).toList());
      boards.add(line);
    }

    // 更新するマス目の定義
    int[] indexNums = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int y = indexNums[0];
    int x = indexNums[1];

    checkChangeCell(boards, y, x);

    for (List<String> board : boards) {
      System.out.println(String.join("", board));
    }

    sc.close();
  }

  static void checkChangeCell(List<List<String>> boards, int y, int x) {
    String target = boards.get(y).get(x);
    changeCell(boards, y, x, target);

    // 上の処理 yが0以外なら上を変更
    if (y != 0) {
      String subTarget = boards.get(y - 1).get(x);
      changeCell(boards, y - 1, x, subTarget);
    }
    // 下の処理 yがy.size未満なら下を変更
    if (y != boards.size() - 1) {
      String subTarget = boards.get(y + 1).get(x);
      changeCell(boards, y + 1, x, subTarget);
    }
    // 左の処理 xが0以外なら左を変更
    if (x != 0) {
      String subTarget = boards.get(y).get(x - 1);
      changeCell(boards, y, x - 1, subTarget);
    }
    // 右の処理 xがx.size未満なら右を変更
    if (x != boards.get(y).size() - 1) {
      String subTarget = boards.get(y).get(x + 1);
      changeCell(boards, y, x + 1, subTarget);
    }
  }

  static void changeCell(List<List<String>> boards, int y, int x, String target) {
    if (target.equals("#")) {
      boards.get(y).set(x, ".");
    } else {
      boards.get(y).set(x, "#");
    }
  }
}
