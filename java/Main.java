import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1行目の処理
    String[] inputNums = sc.nextLine().split(" ");
    int A = Integer.parseInt(inputNums[0]);
    int B = Integer.parseInt(inputNums[1]);
    int C = Integer.parseInt(inputNums[2]);

    int X = A * A;
    int Y = (B * B) + (C * C);

    System.out.println(String.format("%d %d", X, Y));

    sc.close();
  }
}
