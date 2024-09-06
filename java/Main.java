import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 1行目の処理
    String[] strNums = sc.nextLine().split(" ");
    int N = Integer.parseInt(strNums[0]);
    int Q = Integer.parseInt(strNums[1]);

    // 2行目の処理
    String[] bufNums = sc.nextLine().split(" ");
    ArrayList<Integer> list = new ArrayList<>();
    for (String num : bufNums) {
      list.add(Integer.parseInt(num));
    }

    // 3行目以降の処理
    for (int i = 0; i < Q; i++) {
      int query = sc.nextInt();
      switch (query) {
        case 0:
          int functionArgs = sc.nextInt();
          pushBack(list, functionArgs);
          break;

        case 1:
          popBack(list);
          break;

        case 2:
          print(list);
          break;
      }
    }

    sc.close();
  }

  // 要素の追加
  public static ArrayList<Integer> pushBack(ArrayList<Integer> list, int n) {
    list.add(n);
    return list;
  }

  // 要素の削除
  public static ArrayList<Integer> popBack(ArrayList<Integer> list) {
    list.removeLast(); // == list.remove(list.size() - 1);
    return list;
  }

  // 要素の出力
  public static void print(ArrayList<Integer> list) {
    for (int i = 0; i < list.size(); i++) {
      System.out.print(list.get(i));
      if (!(i == list.size() - 1)) {
        System.out.print(" ");
      } else {
        System.out.println();
      }
    }
  }

}
