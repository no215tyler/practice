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


          for (int i = 0; i < nums[0]; i++) {
            String line = sc.nextLine();
            long result = Arrays.stream(line.split(" ")).mapToInt(Integer::parseInt).filter(n -> n == nums[2]).count();
            System.out.println(result);
          }


        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}