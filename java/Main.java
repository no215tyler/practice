import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] inputNum = sc.nextLine().split(" ");
    int A = Integer.parseInt(inputNum[0]);
    int B = Integer.parseInt(inputNum[1]);

    if (A == 1 || B == 1) {
      System.out.println(1);
    } else {
      System.out.println(0);
    }

    sc.close();
  }
}
