// 【宝くじ】
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1等の当選番号
    String[] arrayWinnerNum = sc.nextLine().split("");
    String winnerNum = Arrays.stream(arrayWinnerNum).map(String::valueOf).collect(Collectors.joining(""));

    // 2等の当選番号
    List<String> lastFourDigits = new ArrayList<>();
    for (int i = 2; i < 6 ; i++) {
      lastFourDigits.add(arrayWinnerNum[i]);
    }
    String secondWinnerNum = lastFourDigits.stream().collect(Collectors.joining(""));

    // 3等の当選番号
    List<String> lastThreeDigits = new ArrayList<>();
    for (int i = 3; i < 6 ; i++) {
      lastThreeDigits.add(arrayWinnerNum[i]);
    }
    String threeWinnerNum = lastThreeDigits.stream().collect(Collectors.joining(""));

    // 購入数
    int N = Integer.parseInt(sc.nextLine());

    // メイン処理
    for (int i = 0; i < N; i++) {
      String input = sc.nextLine();
      String[] ticketNums = input.split("");

      // 2等のスコープ
      List<String> ticketSecondNum = new ArrayList<>();
      for (int j = 2; j < 6; j++) {
        ticketSecondNum.add(ticketNums[j]);
      }

      // 3等のスコープ
      List<String> ticketThirdNum = new ArrayList<>();
      for (int j = 3; j < 6; j++) {
        ticketThirdNum.add(ticketNums[j]);
      }

      // 1等の場合: first : 当選番号と一致する番号
      if (input.equals(winnerNum)) {
        System.out.println("first");
      } else if (Integer.parseInt(winnerNum) == 100000 && Integer.parseInt(input) == 100001) { // 前後賞の場合: adjacent : 当選番号の ±1 の番号（当選番号が 100000 または 199999 の場合，前後賞は一つのみ）
        System.out.println("adjacent");
      } else if (Integer.parseInt(winnerNum) == 199999 && Integer.parseInt(input) == 199998) { // 同上
        System.out.println("adjacent");
      } else if (Integer.parseInt(winnerNum) + 1 == Integer.parseInt(input) || Integer.parseInt(winnerNum) - 1 == Integer.parseInt(input)) {
        System.out.println("adjacent");
      } else if (secondWinnerNum.equals(ticketSecondNum.stream().collect(Collectors.joining("")))) { // 2等の場合: second : 当選番号と下 4 桁が一致する番号（1等に該当する番号を除く）
        System.out.println("second");
      } else if (threeWinnerNum.equals(ticketThirdNum.stream().collect(Collectors.joining("")))) { // 3等の場合: third : 当選番号と下 3 桁が一致する番号（1等および2等に該当する番号を除く）
        System.out.println("third");
      } else { // それ以外（外れ）の場合: blank
        System.out.println("blank");
      }
    }

    sc.close();
  }
}

// 【解答例】
// Scanner sc = new Scanner(System.in);

//         int b = sc.nextInt();

//         int n = sc.nextInt();
//         for (int i = 0; i < n; i++) {
//             int a = sc.nextInt();

//             String result = "blank";
//             if (a == b) {
//                 result = "first";
//             } else if (Math.abs(a - b) == 1) {
//                 result = "adjacent";
//             } else if (a % 10000 == b % 10000) {
//                 result = "second";
//             } else if (a % 1000 == b % 1000) {
//                 result = "third";
//             }

//             System.out.println(result);

// 【解説】
// Math クラスの abs メソッドを用いると、絶対値を取得することが出来ます。
// 当選番号と宝くじの番号の下 4 桁が一致しているかどうかを確認するには、両者を 10000 で割った余りを比較すればよいです。下 3 桁についても同様に、1000 で割った余りを比較すればよいです。