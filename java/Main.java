import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String input = sc.nextLine();
      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          for (int num : nums) {
            System.out.println(num);
            if (num == -1) {
              break;
            }
          }
        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}