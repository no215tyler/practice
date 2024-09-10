import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] inputStrNums = sc.nextLine().split(" ");
    int N = Integer.parseInt(inputStrNums[0]);
    int K = Integer.parseInt(inputStrNums[1]) - 1;

    String[] strs = sc.nextLine().split(" ");
    Arrays.sort(strs);

    System.out.println(strs[K]);

    sc.close();
  }
}
