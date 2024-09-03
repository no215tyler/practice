import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = sc.nextLine().split(" ");
    int[] nums = new int[strNums.length];
    for (int i = 0; i < strNums.length; i++) {
      nums[i] = Integer.parseInt(strNums[i]);
    }
    int A = nums[0];
    int B = nums[1];
    int C = nums[2];
    int N = 0;
    N += A;
    N *= B;
    N %= C;
    System.out.println(N);
  }
}
