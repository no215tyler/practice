import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String bufNum = sc.nextLine();

      String inputA = sc.nextLine();
      String inputB = sc.nextLine();
      if (inputA.isEmpty() || inputB.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] numsA = Arrays.stream(inputA.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();
          int[] numsB = Arrays.stream(inputB.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          int A = Arrays.stream(numsA).max().getAsInt();
          int AA = Arrays.stream(numsA).min().getAsInt();
          int B = Arrays.stream(numsB).max().getAsInt();
          int BB = Arrays.stream(numsB).min().getAsInt();
          int[] numsElement = new int[4];
          numsElement[0] = A;
          numsElement[1] = AA;
          numsElement[2] = B;
          numsElement[3] = BB;
          ArrayList<Integer> result = new ArrayList<>();

          for (int i = 0; i <= 1; i++) {
            for (int j = 2; j <= 3; j++) {
              result.add(numsElement[i] * numsElement[j]);
            }
          }

          int output = result.stream().mapToInt(n -> n).max().getAsInt();
          System.out.println(output);
        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}