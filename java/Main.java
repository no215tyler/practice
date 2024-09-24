import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    Map<String, Integer> maps = new HashMap<>();
    for (int i = 0; i < N; i++) {
      String[] input = sc.nextLine().split(" ");
      maps.put(input[0], Integer.parseInt(input[1]));
    }

    List<Map.Entry<String, Integer>> entryList = new ArrayList<>(maps.entrySet());
    entryList.sort(Map.Entry.comparingByValue());

    for (Map.Entry<String, Integer> entry : entryList) {
      System.out.println(entry.getKey());
    }

    sc.close();
  }
}