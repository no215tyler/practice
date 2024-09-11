import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String[] inputNums = sc.nextLine().split(" ");
      int N = Integer.parseInt(inputNums[0]);
      int Q = Integer.parseInt(inputNums[1]);

      ArrayList<Integer> member = new ArrayList<>();

      // 列の人数定義
      for (int i = 1; i <= N; i++) {
        member.add(i);
      }

      // 指示の処理
      for (int i = 0; i < Q; i++) {
        String[] query = sc.nextLine().split(" ");
        switch (query[0]) {
          case "swap":
            int A = Integer.parseInt(query[1]) - 1;
            int B = Integer.parseInt(query[2]) - 1;
            doSwap(member, A, B);
            break;

            case "reverse":
            doReverse(member);
            break;

            case "resize":
            int C = Integer.parseInt(query[1]);
            doResize(member, C);
            break;
        }
      }

      // 出力処理
      for (int n : member) {
        System.out.println(n);
      }

      sc.close();
    }


    // swap
    public static ArrayList<Integer> doSwap(ArrayList<Integer> list, int A, int B) {
      int buf = list.get(A);
      list.set(A, list.get(B));
      list.set(B, buf);
      return list;
    }

    // reverse
    public static ArrayList<Integer> doReverse(ArrayList<Integer> list) {
      Collections.reverse(list);
      return list;
    }

    // resize
    public static ArrayList<Integer> doResize(ArrayList<Integer> list, int C) {
      if (list.size() > C) {
        int times = (list.size() - C);
        for (int i = 0; i < times; i++) {
          list.remove(C);
        }
      }
      return list;
    }
}