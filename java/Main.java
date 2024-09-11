import java.util.*;

public class Main {
  public static void main(String[] args) {
    int[] nums = {1, 3, 5, 1, 2, 3, 6, 6, 5, 1, 4};

    ArrayList<Integer> result = new ArrayList<>();

    for (int i = 1; i < nums.length; i++) {
      checkUnique(result, nums[i]);
    }
    Collections.sort(result);
    for (int num : result) {
      System.out.println(num);
    }
  }

  public static ArrayList<Integer> checkUnique(ArrayList<Integer> result, int num) {
    if (result.size() > 0) {
      boolean flg = false;

      // メイン処理
      for (int i = 0; i < result.size(); i++) {
        if (flg == false && result.get(i) == num) {
          flg = true;
          break;
        } else if (flg == false && result.get(i) != num && i == (result.size() - 1)) {
          result.add(num);
        }
      }
    } else { // ArrayListの中身が空なら追加する
      result.add(num);
    }

    return result;
  }
}

// 【模範回答】
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         List<Integer> li = Arrays.asList(1, 3, 5, 1, 2, 3, 6, 6, 5, 1, 4);
//         Set<Integer> a = new TreeSet(li);

//         for (int x : a) {
//             System.out.println(x);
//         }
//     }
// }
