import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] inputStrNums = sc.nextLine().split(" ");
    int N = Integer.parseInt(inputStrNums[0]);
    int M = Integer.parseInt(inputStrNums[1]);
    int K = Integer.parseInt(inputStrNums[2]) - 1;
    int L = Integer.parseInt(inputStrNums[3]) - 1;

    int[][] numsArray = new int[N][M];

    for (int i = 0; i < N; i++) {
      String[] strNumsArray = sc.nextLine().split(" ");
      for (int j = 0; j < M; j++) {
        numsArray[i][j] = Integer.parseInt(strNumsArray[j]);
      }
    }

    System.out.println(numsArray[K][L]);

    sc.close();
  }
}
