import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int bufNum = Integer.parseInt(sc.nextLine());

      String input = sc.nextLine();
      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          Arrays.stream(nums).forEach(n -> {
            if (n % 2 == 0) {
              System.out.println("even");
            } else {
              System.out.println("odd");
            }
          });
        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}