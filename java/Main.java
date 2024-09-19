import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] line = sc.nextLine().split(" ");
    int N = Integer.parseInt(line[0]);
    int K = Integer.parseInt(line[1]);

    ArrayList<ArrayList<String>> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      ArrayList<String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));
      list.add(input);
    }

    for (int i = 0; i < K; i++) {
      String[] changeElem = sc.nextLine().split(" ");
      int index = Integer.parseInt(changeElem[0]);
      String updateName = changeElem[1];
      User.changeName(list, index, updateName);
    }

    for (ArrayList<String> li : list) {
      User.output(li.get(0), li.get(1), li.get(2), li.get(3));
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
    System.out.println(String.format("%s %s %s %s", nickname, old, birth, state));
  }

  public static ArrayList<ArrayList<String>> changeName(ArrayList<ArrayList<String>> list, int index, String nickname) {
    list.get(index - 1).set(0, nickname);
    return list;
  }
}