import java.util.*;

public class Main {
    public static void main(String[] args) {

      int[] nums = {-100, 2, 3, 5, 8};

      int min = Arrays.stream(nums)
                      .min()
                      .getAsInt();

      int max = Arrays.stream(nums)
                      .max()
                      .getAsInt();

      System.out.println(min);
      System.out.println(max);
    }
}