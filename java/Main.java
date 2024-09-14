// 問題 10: 配列内の要素を逆順に並び替える
// 整数の配列が与えられます。その配列を逆順に並び替えて出力してください。

// 例 入力: {1, 2, 3, 4, 5}
// 出力: {5, 4, 3, 2, 1}

import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();

      if (input.isEmpty()) {
        System.out.println("配列が空です");
      } else {
        try {
          int[] nums = Arrays.stream(input.split(" "))
                      .mapToInt(Integer::parseInt)
                      .toArray();

          Arrays.stream(nums).boxed().sorted(Comparator.reverseOrder()).forEach(System.out::println);;

        } catch (NumberFormatException e) {
          System.out.println("不正な入力があります: " + e.getMessage());
        }
      }

      sc.close();
    }
}


// 【フィードバック】
// 問題10のコードはかなり良くできていますが、目的通りに「一行で 5, 4, 3, 2, 1 のように出力する」ためにはいくつかの修正が必要です。

// まず、boxed()メソッドとjoining(", ")の使い方を解説します。

// boxed()メソッドの意味
// mapToInt()やmapToDouble()のようにプリミティブ型（int, double など）に変換するストリーム操作を行うと、その結果はIntStreamやDoubleStreamになります。これらは基本的にプリミティブ型（基本データ型）の操作を効率化するためのものです。

// しかし、プリミティブ型のIntStreamやDoubleStreamでは、sorted(Comparator.reverseOrder())のような操作やCollectors.joining()のようなメソッドは直接使用できません。そこで、boxed()を使ってプリミティブ型からラッパー型（int → Integer）に変換し、通常のStream<Integer>に変換する必要があります。

// boxed()は、プリミティブ型のストリーム（IntStream, DoubleStreamなど）を、それに対応するラッパー型（Integer, Doubleなど）のストリームに変換します。
// Collectors.joining(", ")の使い方
// Collectors.joining()は、ストリーム内の要素を文字列として結合するために使います。引数に区切り文字（例えば ", "）を渡すことで、要素同士をその区切りでつないだ文字列を返します。

// 修正コード
// 次に、forEach(System.out::println)を使って各要素を改行して出力するのではなく、Collectors.joining(", ")を使って一行で出力する方法を示します。

// java
// コードをコピーする
// import java.util.*;
// import java.util.stream.Collectors;

          // boxed()でラッパー型に変換し、sorted()で降順にし、joining()で一行にまとめる
          // String result = Arrays.stream(nums)
          //                       .boxed()  // int型からInteger型へ
          //                       .sorted(Comparator.reverseOrder())  // 降順にソート
          //                       .map(String::valueOf)  // 各要素を文字列に変換
          //                       .collect(Collectors.joining(", "));  // カンマ区切りで結合

          // System.out.println(result);  // 一行で出力

