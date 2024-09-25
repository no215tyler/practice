import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 五目盤の定義
    List<List<String>> boards = new ArrayList<>();
    for (int i = 0; i < 5; i++) {
      List<String> board = new ArrayList<>(Arrays.stream(sc.nextLine().split("")).collect(Collectors.toList()));
      boards.add(board);
    }

    // 動作フラグの定義
    boolean flg = true;

    // Row（行）で一致があるかチェック
    if (flg) {
      for (List<String> board : boards) {
        long O = board.stream().filter(o -> o.equals("O")).count();
        long X = board.stream().filter(o -> o.equals("X")).count();
        if(O == 5) {
          flg = false;
          System.out.println("O");
          break;
        } else if (X == 5) {
          flg = false;
          System.out.println("X");
          break;
        }
      }
    }

    // Column（列）で一致があるかチェック
    if (flg) {
      List<String> bufBoard = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
        bufBoard.add(boards.get(0).get(i));
        bufBoard.add(boards.get(1).get(i));
        bufBoard.add(boards.get(2).get(i));
        bufBoard.add(boards.get(3).get(i));
        bufBoard.add(boards.get(4).get(i));
        long O = bufBoard.stream().filter(s -> s.equals("O")).count();
        long X = bufBoard.stream().filter(s -> s.equals("X")).count();
        if(O == 5) {
          flg = false;
          System.out.println("O");
          break;
        } else if (X == 5) {
          flg = false;
          System.out.println("X");
          break;
        }
        bufBoard.clear();
      }
    }

    // 斜めで一致があるかチェック左上〜右下
    if (flg) {
      List<String> lists = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
        lists.add(boards.get(i).get(i));
      }
      long O = lists.stream().filter(s -> s.equals("O")).count();
      long X = lists.stream().filter(s -> s.equals("X")).count();
      if(O == 5) {
        flg = false;
        System.out.println("O");
      } else if (X == 5) {
        flg = false;
        System.out.println("X");
      }
    }

    // 斜めで一致があるかチェック右上〜左下
    if (flg) {
      List<String> lists = new ArrayList<>();
      for (int i = 0; i < 5; i++) {
        lists.add(boards.get(i).get(4 - i));
      }
      long O = lists.stream().filter(s -> s.equals("O")).count();
      long X = lists.stream().filter(s -> s.equals("X")).count();
      if(O == 5) {
        flg = false;
        System.out.println("O");
      } else if (X == 5) {
        flg = false;
        System.out.println("X");
      }
    }

    // 引き分け判定（上記のチェックで flg が false にならなければDraw）
    if (flg){
      System.out.println("D");
    }

    sc.close();
  }
}