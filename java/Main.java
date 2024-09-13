import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String[] inputNums = sc.nextLine().split(" ");
      int N = Integer.parseInt(inputNums[0]);
      int K = Integer.parseInt(inputNums[1]);
      int T = Integer.parseInt(inputNums[2]);

      int walkDistance = N * K;

      if (walkDistance > T) {
        System.out.println("NO");
      } else {
        System.out.println("YES");
      }

      sc.close();
    }
}