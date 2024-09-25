import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 初期入力
    List<String> Alphabet = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "N", "M", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"));
    int X = Alphabet.indexOf(sc.nextLine());
    int Y = Alphabet.indexOf(sc.nextLine());
    int C = Alphabet.indexOf(sc.nextLine());

    // A と D の範囲に C が含まれていれば true そうでなければ false を出力
    // （A が D よりも後ろになる場合も false を出力）
    if (Y < X) {
      System.out.println(false);
    } else if (X <= C && Y >= C) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }

    sc.close();
  }
}