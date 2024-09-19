import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int N = Integer.parseInt(sc.nextLine());
    for (int i = 0; i < N; i++) {
      String[] input = sc.nextLine().split(" ");
      User.output(input[0], input[1], input[2], input[3]);
    }

    sc.close();
  }
}

class User {
  String nickname;
  String old;
  String birth;
  String state;

  public User(String nickname, String old, String birth, String state) {
    this.nickname = nickname;
    this.old = old;
    this.birth = birth;
    this.state = state;
  }

  public static void output(String nickname, String old, String birth, String state) {
    System.out.println(String.format("User{\nnickname : %s\nold : %s\nbirth : %s\nstate : %s\n}", nickname, old, birth, state));
  }
}