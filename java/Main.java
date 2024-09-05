import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    for (int i = 1; i <= 9; i++) {
      for (int j = 1; j <= 9; j++) {
        System.out.print(String.format("%2d", i * j));
        if (j == 9) {
          System.out.println();
          if (!(i == 9)) {
            System.out.println("==========================================");
          }
        } else {
          System.out.print(" | ");
        }
      }
    }

    sc.close();
  }
}
