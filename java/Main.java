// 問題 21: ラムダ式
// 整数のリストを作成し、その中から3の倍数の要素だけをフィルタリングして、各要素を3倍にして出力してください。
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12));
    nums.stream().filter(n -> n % 3 == 0).forEach(n -> {
      System.out.println(n * 3);
    });

    sc.close();
  }
}