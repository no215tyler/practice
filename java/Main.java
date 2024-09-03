import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = sc.nextLine().split(" ");
    for (int i = 0; i < strNums.length; i += 3) {
      System.out.println(String.format("%s %s %s", strNums[i], strNums[i + 1], strNums[i + 2]));
    }
    sc.close();
  }
}