import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      // 入力を半角スペースで配列化
      String[] strs = sc.nextLine().split(" ");

      // 要素の重複を除いて配列化
      List<String> uniqueStrs = new ArrayList<>();
      for (String str : strs) {
        long index = uniqueStrs.stream().filter(s -> s.equals(str)).count();
        if (index == 0) {
          uniqueStrs.add(str);
        }
      }

      // 要素のカウント
      for (String str : uniqueStrs) {
        long cnt = Arrays.stream(strs).filter(s -> s.equals(str)).count();
        System.out.println(String.format("%s %d", str, cnt));
      }
      sc.close();
    }
}