import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());

    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int num = Integer.parseInt(sc.nextLine());
      if (num >= 5) {
        list.add(num);
      }
    }

    int result = list.stream().mapToInt(Integer::intValue).sum();
    System.out.println(result);

    sc.close();
  }
}
