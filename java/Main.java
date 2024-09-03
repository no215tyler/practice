import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    if (Objects.equals(str, "paiza")) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}

// 文字列比較は「==演算子」ではなくequalsメソッドを使う
// 文字列変数.equals(比較対象);
// もしくは
// Objects.equals(文字列, 比較対象);