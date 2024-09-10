import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] inputStrNums = sc.nextLine().split(" ");
    int N = Integer.parseInt(inputStrNums[0]);
    int M = Integer.parseInt(inputStrNums[1]);

    int[] numsArray = new int[M];

    String[] strNumsArray = sc.nextLine().split(" ");
    for (int i = 0; i < M; i++) {
      numsArray[i] = Integer.parseInt(strNumsArray[i]);
    }

    int count = 0;
    for (int num : numsArray) {
      if (num == N) {
        count += 1;
      }
    }

    System.out.println(count);

    sc.close();
  }
}
