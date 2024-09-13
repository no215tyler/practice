// 問題 2: 文字列の配列から特定の文字で始まる要素をカウントする
// 文字列の配列が与えられます。その中から特定の文字（例: "A"）で始まる要素を数えてください。

// 例
// 入力: {"Apple", "Banana", "Avocado", "Blueberry", "Apricot"}
// 出力: 3 （"Apple", "Avocado", "Apricot"）

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String[] input = sc.nextLine().split(" ");
      long count = Arrays.stream(input).filter(str -> str.startsWith("A")).count();
      System.out.println(count);

      sc.close();
    }
}
