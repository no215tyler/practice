import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());

    List<String> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      String input = sc.nextLine();
      list.add(input);
      long strikeCnt = list.stream().filter(s -> s.equals("strike")).count();
      long ballCnt = list.stream().filter(s -> s.equals("ball")).count();
      if (strikeCnt == 3) {
        System.out.println("out!");
      } else if (ballCnt == 4) {
        System.out.println("fourball!");
      } else if (input.equals("strike") && strikeCnt < 3) {
        System.out.println("strike!");
      } else if (input.equals("ball") && ballCnt < 4) {
        System.out.println("ball!");
      }
    }

    sc.close();
  }
}