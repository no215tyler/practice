import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 1; i <= N; i++) {
      list.add(i);
      for (int j = 0; j < list.size(); j++) {
        System.out.print(list.get(j));
        if (j == list.size() - 1) {
          System.out.println();
        } else {
          System.out.print(" ");
        }
      }
    }

    sc.close();
  }
}