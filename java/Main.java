import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1行目の処理
    String[] inputNums = sc.nextLine().split(" ");
    int A = Integer.parseInt(inputNums[0]);
    int B = Integer.parseInt(inputNums[1]);
    int C = Integer.parseInt(inputNums[2]);
    int D = Integer.parseInt(inputNums[3]);

    int N = (int) Math.pow(((A + B) * C), 2) % D;

    System.out.println(N);

    sc.close();
  }
}
