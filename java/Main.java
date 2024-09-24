import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String trgt = sc.nextLine();
    String[] strs = sc.nextLine().split("");
    List<String> list = new ArrayList<>();

    for (int i = 1; i < strs.length; i++) {
      List<String> bufStr = new ArrayList<>();
      for (int j = trgt.length() - 1; j >= 0; j--) {
        bufStr.add(strs[i - j]);
      }
      list.add(bufStr.stream().collect(Collectors.joining("")));
    }

    long count = list.stream().filter(s -> s.equals(trgt)).count();
    System.out.println(count);

    sc.close();
  }
}

// 【模範解答】
// import java.util.Scanner;

// public class Main {
//   public static void main(String[] args) {
//     Scanner scan = new Scanner(System.in);
//     String pattern = scan.nextLine();
//     String str = scan.nextLine();

//     int cnt = 0;
//     for (int i = 0; i <= str.length() - pattern.length(); i++) {
//         String s = str.substring(i, i + pattern.length());
//         if (s.equals(pattern)) {
//           cnt++;
//         }
//     }
//     System.out.println(cnt);
//   }
// }