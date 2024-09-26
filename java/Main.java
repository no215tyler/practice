import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] inputNums = Arrays.stream(sc.nextLine()
                            .split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
    int N = inputNums[0]; // プレイヤー人数
    int K = inputNums[1]; // 単語リスト数
    int M = inputNums[2]; // しりとりの回数

    // プレイヤー定義
    List<Integer> players = new ArrayList<>(IntStream.rangeClosed(1, N).boxed().collect(Collectors.toList()));

    // 単語の定義
    List<String> wordList = new ArrayList<>();
    for (int i = 0; i < K; i++) {
      wordList.add(sc.nextLine());
    }

    // 単語末尾の変数定義
    List<String> lastStr = new ArrayList<>();

    // 脱落フラグの定義
    boolean dropout = true;

    // 指定回数分しりとりをプレイ
    for (int i = 0; i < M; i++) {
      int index = i % players.size(); // (i >= players.size()) ? (i % players.size()) : i;
      if (i > 0 && dropout && index != 0) {
        index -= 1;
      }

      if (i > 0 && dropout && index == 0) {
        index = players.size() - 1;
      }

      String word = sc.nextLine();
      dropout = checkRule(players, index, wordList, word, lastStr, dropout);

    }

    // 出力処理
    System.out.println(players.size());
    players.stream().forEach(System.out::println);

    sc.close();
  }

  static boolean checkRule(List<Integer> players, int index, List<String> wordList, String word, List<String> lastStr, boolean dropout) {
    int wordIndex = wordList.indexOf(word);
    String[] strs = word.split("");
    int lastIndex = strs.length - 1;
    lastStr.clear();
    lastStr.add(strs[lastIndex]);
    // 2. 「dropout: false」の場合は前回の単語末尾との一致を判定 ### 「dropout: true」の場合は（脱落者がいれば）このルールは無視
    if (!dropout && !(strs[lastIndex].equals(lastStr.get(0)))) {
      players.remove(index);
      dropout = true;
      return dropout;
    }
    // 1. 発言ワードがリストに存在しなければ脱落 -> dropout: trueに変更
    // 3. いままでに発言された単語を発言した場合は脱落 -> dropout: trueに変更
    if (wordIndex >= 0) {
      // ルール通りなら単語リストのワードを「.」に変更
      wordList.set(wordIndex, ".");
    } else {
      players.remove(index);
      dropout = true;
      return dropout;
    }

    // 4. 「z」で終了するワードを発言したら脱落 -> dropout: falseに変更
    if (strs[lastIndex].equals("z")) {
      players.remove(index);
      dropout = true;
      return dropout;
    }

    // ルール違反がなければdropoutフラグをfalseにして処理終了
    if (dropout) {
      dropout = false;
    }
    return dropout;
  }
}