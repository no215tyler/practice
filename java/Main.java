import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int N = input[0];
    int K = input[1];

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      list.add(Integer.parseInt(sc.nextLine()));
    }

    for (int i = 0; i < K; i++) {
      String prompt = sc.nextLine();
      if (prompt.equals("pop")) {
        pop(list);
      } else if (prompt.equals("show")) {
        show(list);
      }
    }
  }

  static void pop(List<Integer> list) {
    list.remove(0);
  }

  static void show(List<Integer> list) {
    list.stream().forEach(System.out::println);
  }
}