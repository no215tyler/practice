import java.util.*;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 初期入力
    int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    int H = input[0];
    int W = input[1];
    int N = input[2];
    int K = input[3];

    List<List<Integer>> kitMaps = new ArrayList<>();
    for (int i = 0; i < 10; i++) {
      List<Integer> kitMap = Arrays.stream(sc.nextLine().split(" "))
                                        .map(Integer::parseInt)
                                        .collect(Collectors.toList());
      kitMaps.add(kitMap);
    }

    // ロボットの台数
    List<Robot> robots = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      int[] position = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
      robots.add(new Robot(position, position[2]));
    }

    // 指定回数分のロボット移動
    for (int i = 0; i < K; i++) {
      String[] move = sc.nextLine().split(" ");
      int index = Integer.parseInt(move[0]) - 1;
      String direction = move[1];

      switch (direction) {
        case "W":
          robots.get(index).west(robots.get(index), kitMaps, W);
          break;

        case "E":
          robots.get(index).east(robots.get(index), kitMaps, W);
          break;

        case "N":
          robots.get(index).north(robots.get(index), kitMaps, H);
          break;

        case "S":
          robots.get(index).south(robots.get(index), kitMaps, H);
          break;
      }
    }


    // 出力処理
    robots.stream().forEach(r -> {
      System.out.println(String.format("%d %d %d", r.position[0], r.position[1], r.lv));
    });


    sc.close();
  }
}

class Robot {
  int[] position;
  int lv;

  // コンストラクタ
  Robot(int[] position, int lv) {
    this.position = position;
    this.lv = lv;
  }

  void west(Robot robot, List<List<Integer>> kitMaps, int W) {
    if (robot.lv == 1) {
      robot.position[0] -= 1;
    } else if (robot.lv == 2) {
      robot.position[0] -= 2;
    } else if (robot.lv == 3) {
      robot.position[0] -= 5;
    } else if (robot.lv >= 4) {
      robot.position[0] -= 10;
    }

    List<Integer> position = Arrays.asList(robot.position[0], robot.position[1]);
    long cnt = kitMaps.stream().filter(a -> a.equals(position)).count();
    if (cnt > 0) {
      robot.lv += 1;
    }
  }

  void east(Robot robot, List<List<Integer>> kitMaps, int E) {
    if (robot.lv == 1) {
      robot.position[0] += 1;
    } else if (robot.lv == 2) {
      robot.position[0] += 2;
    } else if (robot.lv == 3) {
      robot.position[0] += 5;
    } else if (robot.lv >= 4) {
      robot.position[0] += 10;
    }

    List<Integer> position = Arrays.asList(robot.position[0], robot.position[1]);
    long cnt = kitMaps.stream().filter(a -> a.equals(position)).count();
    if (cnt > 0) {
      robot.lv += 1;
    }
  }

  void north(Robot robot, List<List<Integer>> kitMaps, int N) {
    if (robot.lv == 1) {
      robot.position[1] -= 1;
    } else if (robot.lv == 2) {
      robot.position[1] -= 2;
    } else if (robot.lv == 3) {
      robot.position[1] -= 5;
    } else if (robot.lv >= 4) {
      robot.position[1] -= 10;
    }

    List<Integer> position = Arrays.asList(robot.position[0], robot.position[1]);
    long cnt = kitMaps.stream().filter(a -> a.equals(position)).count();
    if (cnt > 0) {
      robot.lv += 1;
    }
  }

  void south(Robot robot, List<List<Integer>> kitMaps, int S) {
    if (robot.lv == 1) {
      robot.position[1] += 1;
    } else if (robot.lv == 2) {
      robot.position[1] += 2;
    } else if (robot.lv == 3) {
      robot.position[1] += 5;
    } else if (robot.lv >= 4) {
      robot.position[1] += 10;
    }

    List<Integer> position = Arrays.asList(robot.position[0], robot.position[1]);
    long cnt = kitMaps.stream().filter(a -> a.equals(position)).count();
    if (cnt > 0) {
      robot.lv += 1;
    }
  }
}