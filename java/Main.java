import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 初期入力
    int[] nums = Arrays.stream(sc.nextLine()
                      .split(" ")).mapToInt(Integer::parseInt)
                      .toArray();
    int N = nums[0];
    int K = nums[1];

    List<String> members = new ArrayList<>();

    // 初期メンバー
    for (int i = 0; i < N; i++) {
      members.add(sc.nextLine());
    }

    // イベント分岐
    for (int i = 0; i < K; i++) {
      String[] query = sc.nextLine().split(" ");
      String prompt = query[0];
      // 握手会
      if (prompt.equals("handshake")) {
        handShake(members);
      // メンバー加入
      } else if (prompt.equals("join")) {
        String member = query[1];
        join(members, member);
      // メンバー脱退
      } else if (prompt.equals("leave")) {
        String member = query[1];
        leave(members, member);
      } else {
        System.out.println("error: 予期せぬエラー");
      }
    }

    sc.close();
  }

  static void join(List<String> members, String name) {
    members.add(name);
  }

  static void leave(List<String> members, String name) {
    int index = members.indexOf(name);
    // 名前が存在しない場合のエラー対策
    if (index >= 0) {
      members.remove(index);
    }
  }

  static void handShake(List<String> members) {
    if (members.size() > 0) {
      Collections.sort(members);
      members.stream().forEach(System.out::println);
    }
  }
}
