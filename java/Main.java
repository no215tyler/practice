import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String[] inputNums = sc.nextLine().split(" ");
      int X = Integer.parseInt(inputNums[0]);
      int Y = Integer.parseInt(inputNums[1]);
      int Z = Integer.parseInt(inputNums[2]);

      if ((Z >= 10) || ((X >= 10) && (Y >= 10))) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

      sc.close();
    }
}