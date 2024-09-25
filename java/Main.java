// 問題 22: Stream API
// 文字列のリストを作成し、名前が5文字以上のものをすべて小文字に変換し、その結果をリストとして収集してください。
import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    List<String> list = new ArrayList<>(Arrays.asList("BLACK", "BLUE", "RED", "WHITE", "YELLOW", "BROWN"));

    List<String> result = list.stream().filter(s -> s.length() >= 5).map(String::toLowerCase).collect(Collectors.toList());
    result.stream().forEach(System.out::println);
    sc.close();
  }
}