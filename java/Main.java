import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] inputStrNums = sc.nextLine().split(" ");
    int N = Integer.parseInt(inputStrNums[0]);
    int K = Integer.parseInt(inputStrNums[1]) - 1;

    String[] strNumsArray = sc.nextLine().split(" ");
    int[] numsArray = new int[N];

    for (int i = 0; i < N; i++) {
      numsArray[i] = Integer.parseInt(strNumsArray[i]);
    }

    System.out.println(numsArray[K]);

    sc.close();
  }
}
