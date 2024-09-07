import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1行目の処理
    String[] inputNums = sc.nextLine().split(" ");
    int H = Integer.parseInt(inputNums[0]);
    int W = Integer.parseInt(inputNums[1]);
    int r = Integer.parseInt(inputNums[2]) - 1;
    int c = Integer.parseInt(inputNums[3]) - 1;

    String[][] board = new String[H][W];
    for (int i = 0; i < H; i++) {
      board[i] = sc.nextLine().split("");
    }

    // 変数r, cで指定した位置が壁（#）かそうじゃないか判定
    if (board[r][c].equals("#")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }

    sc.close();
  }
}
