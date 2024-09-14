import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.nextLine());
      String input = sc.nextLine();
      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();
          long count = Arrays.stream(nums).filter(n -> n == 1).count();
          System.out.println(count);

        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}