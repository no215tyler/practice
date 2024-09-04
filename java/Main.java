import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 入力を受け取る
    String[] NUMS = sc.nextLine().split(" ");
    String[] strNumsA = sc.nextLine().split(" ");
    String[] strNumsB = sc.nextLine().split(" ");

    // 数値に分割
    int N = Integer.parseInt(NUMS[0]);
    int M = Integer.parseInt(NUMS[1]);

    // 関数で数値型配列を戻す
    ArrayList<Integer> numsA = compileToArrayNums(N, strNumsA);
    ArrayList<Integer> numsB = compileToArrayNums(M, strNumsB);

    for (int num : numsB) {
      for (int i = 0; i < num; i++) {
        System.out.print(numsA.get(0));
        numsA.remove(0);
        if (i == num - 1) {
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }
    }

    sc.close();
  }


  public static ArrayList<Integer> compileToArrayNums(int N, String[] strNums) {
    ArrayList list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(Integer.parseInt(strNums[i]));
    }

    return list;
  }
}