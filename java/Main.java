import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] XDK = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    List<Integer> list = new ArrayList<>(Arrays.asList(XDK[0]));

    for (int i = 1; i < XDK[2]; i++) {
      list.add(list.get(i - 1) + XDK[1]);
    }

    System.out.println(list.get(XDK[2] - 1));

    sc.close();
  }
}
