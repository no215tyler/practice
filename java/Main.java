import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Userのリスト
    List<User> users = new ArrayList<>();

    // User名と血液型のインスタンスをリスト化
    int N = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < N; i++) {
      String[] input = sc.nextLine().split(" ");
      User user = new User(input[0], input[1]);
      users.add(user);
    }

    // 占いの定義
    List<List<String>> lists = new ArrayList<>();
    int M = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < M; i++) {
      lists.add(Arrays.stream(sc.nextLine().split(" ")).collect(Collectors.toList()));
    }

    // 出力処理
    for (User user : users) {
      for (List<String> list : lists) {
        int index = list.indexOf(user.bloodType) + 1;
        if (index > 0) {
          System.out.println(String.format("%s %s", user.name, list.get(index)));
          break;
        }
      }
    }


    sc.close();
  }
}

class User {
  String name;
  String bloodType;

  public User(String name, String bloodType) {
    this.name = name;
    this.bloodType = bloodType;
  }
}