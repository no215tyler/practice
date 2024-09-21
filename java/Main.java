import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int[] inputLine = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

    // 初期入力
    int N = inputLine[0];
    int K = inputLine[1];

    // 勇者リスト
    List<Braver> bravers = new ArrayList<>();

    // 勇者追加
    for (int i = 0; i < N; i++) {
      int[] status = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      bravers.add(new Braver(status));
    }

    // イベント処理
    for (int i = 0; i < K; i++) {
      String[] query = sc.nextLine().split(" ");
      // イベント名の取得
      String eventName = query[1];
      // 対象勇者の取得
      Braver braver = bravers.get(Integer.parseInt(query[0]) - 1);
      List<Integer> status = new ArrayList<>();

      // 【イベント分岐】
      // レベルアップ
      if (eventName.equals("levelup")) {
        for (int j = 2; j <= 7; j++) {
          status.add(Integer.parseInt(query[j]));
        }
        braver.levelUp(braver, status);

      // 筋力アップ
      } else if (eventName.equals("muscle_training")) {
        for (int j = 2; j <= 3; j++) {
          status.add(Integer.parseInt(query[j]));
        }
        braver.muscleTraining(braver, status);

      // ランニング
      } else if (eventName.equals("running")) {
        for (int j = 2; j <= 3; j++) {
          status.add(Integer.parseInt(query[j]));
        }
        braver.running(braver, status);

      // 学習
      } else if (eventName.equals("study")) {
        status.add(Integer.parseInt(query[2]));
        braver.study(braver, status);

      // 祈る
      } else if (eventName.equals("pray")) {
        status.add(Integer.parseInt(query[2]));
        braver.pray(braver, status);
      }
    }

    // 完了処理
    bravers.stream().forEach(b -> {
      System.out.println(String.format("%d %d %d %d %d %d %d", b.lv, b.hp, b.attack, b.defense, b.speed, b.intelligence, b.luck));
    });

    sc.close();
  }
}

class Braver {
  int lv;
  int hp;
  int attack;
  int defense;
  int speed;
  int intelligence;
  int luck;

  Braver(int[] status) {
    this.lv = status[0];
    this.hp = status[1];
    this.attack = status[2];
    this.defense = status[3];
    this.speed = status[4];
    this.intelligence = status[5];
    this.luck = status[6];
  }

  public void levelUp(Braver braver, List<Integer> upStatus) {
    braver.lv += 1;
    braver.hp += upStatus.get(0);
    braver.attack += upStatus.get(1);
    braver.defense += upStatus.get(2);
    braver.speed += upStatus.get(3);
    braver.intelligence += upStatus.get(4);
    braver.luck += upStatus.get(5);
  }

  public void muscleTraining(Braver braver, List<Integer> upStatus) {
    braver.hp += upStatus.get(0);
    braver.attack += upStatus.get(1);
  }

  public void running(Braver braver, List<Integer> upStatus) {
    braver.defense += upStatus.get(0);
    braver.speed += upStatus.get(1);
  }

  public void study(Braver braver, List<Integer> upStatus) {
    braver.intelligence += upStatus.get(0);
  }

  public void pray(Braver braver, List<Integer> upStatus) {
    braver.luck += upStatus.get(0);
  }
}