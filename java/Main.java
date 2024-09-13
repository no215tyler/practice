// 問題 5: 文字列をアルファベット順にソートする
// 文字列の配列が与えられます。その配列をアルファベット順にソートして出力してください。

// 例
// 入力: {"Banana", "Apple", "Cherry", "Date"}
// 出力: {"Apple", "Banana", "Cherry", "Date"}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      String[] strs = sc.nextLine().split(" ");
      int[] fruitCount = {strs.length};
      Arrays.stream(strs).sorted().forEach(fruit -> {
        fruitCount[0] -= 1;
        System.out.print(fruit);
        if (fruitCount[0] == 0) {
          System.out.println();
        } else {
          System.out.print(", ");
        }
      });

      sc.close();
    }
}

// フィードバック
// 改善点:
// 冗長な出力制御:

// fruitCount[0]を使用してカウントダウンし、カンマを制御する方法は工夫されていますが、Collectors.joiningを使うとよりシンプルに実装可能です。以下のようにすることでコードの可読性が向上します。
// java
// コードをコピーする
// System.out.println(Arrays.stream(strs).sorted().collect(Collectors.joining(", ")));
// Collectors.joining(", ")を使うと、カンマ区切りで要素を簡単に出力できます。

// 配列の長さ取得方法の冗長さ:

// fruitCountで配列の長さを保持する必要はなく、strs.lengthで必要に応じてそのまま使えます。また、配列長を使ってカウントダウンするのはやや冗長です。
// 変数名の適切さ:

// fruitCountという変数名は、ソートと出力制御の文脈では適切ではないかもしれません。機能に即した名前を付けるとわかりやすくなります。
// 【例】
    // String[] strs = sc.nextLine().split(" ");
    // // Collectors.joiningを使ってカンマ区切りの文字列を生成
    // System.out.println(Arrays.stream(strs).sorted().collect(Collectors.joining(", ")));


