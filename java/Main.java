import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = sc.nextLine().split(" ");
    int H = Integer.parseInt(strNums[0]);
    int W = Integer.parseInt(strNums[1]);
    String A = strNums[2];
    String B = strNums[3];
    int separatorCount = (W * 6) + ((W - 1) * 3);

    for (int i = 0; i < H; i++) {
      for (int j = 0; j < W; j++) {
        System.out.print(String.format("(%s, %s)", A, B));
        if (j == W - 1) {
          System.out.println();
          if (!(i == H - 1)) {
            String[] separator = new String[separatorCount];
            for (int k = 0; k < separatorCount; k++) {
              separator[k] = "=";
            }
            System.out.println(String.join("", separator));
          }
        } else {
          System.out.print(" | ");
        }
      }
    }

    sc.close();
  }
}
