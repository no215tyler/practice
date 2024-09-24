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

    changeCell(boards, y, x);

    for (List<String> board : boards) {
      System.out.println(String.join("", board));
    }

    sc.close();
  }

  static void changeCell(List<List<String>> boards, int y, int x) {
    String target = boards.get(y).get(x);
    if (target.equals("#")) {
      boards.get(y).set(x, ".");
    } else {
      boards.get(y).set(x, "#");
    }
  }
}
