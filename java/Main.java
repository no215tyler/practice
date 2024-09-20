import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] inputNK = sc.nextLine().split(" ");
    int N = Integer.parseInt(inputNK[0]);
    int K = Integer.parseInt(inputNK[1]);

    Map<Integer, User> members = new HashMap<>();

    // 会計人数カウント用
    int payCnt = 0;

    for (int i = 0; i < N; i++) {
      int age = Integer.parseInt(sc.nextLine());
      User user = new User(age, false, 0);
      members.put(i, user);
    }

    // オーダー処理
    for (int i = 0; i < K; i++) {
      String[] order = sc.nextLine().split(" ");
      int index = Integer.parseInt(order[0]) - 1;
      User member = members.get(index);
      // 注文: アルコール（ビール以外）
      if (order[1].equals("alcohol")) {
        member.payment = member.buy(member.age, member.discount, order[1], member.payment, Integer.parseInt(order[2]));
        member.discount = true;

      // 注文: ビール
      } else if (order[1].equals("0")) {
        member.payment = member.buy(member.age, member.discount, "alcohol", member.payment, 500);
        member.discount = true;

      // 注文: ソフトドリンク
      } else if (order[1].equals("softdrink")) {
        member.payment = member.buy(member.age, member.discount, order[1], member.payment, Integer.parseInt(order[2]));

      // 注文: フード
      } else if (order[1].equals("food")) {
        member.payment = member.buy(member.age, member.discount, order[1], member.payment, Integer.parseInt(order[2]));

      // 会計（退店）
      } else if (order[1].equals("A")) {
        member.putsPayment(member.payment);
        payCnt += 1;
      }
    }

    // 終業処理
    System.out.println(payCnt);

    sc.close();
  }
}

class User {
  int age;
  boolean discount;
  int payment;

  // コンストラクタ
  public User(int age, boolean discount, int payment) {
    this.age = age;
    this.discount = discount;
    this.payment = payment;
  }

  // 注文メソッド
  public int buy(int age, boolean discount, String category, int payment, int price) {
    int result = 0;
    // アルコールの注文
    if (category.equals("alcohol")) {
      if (age >= 20) {
          result = payment + price;
      }
    }

    // ソフトドリンクの注文
    if (category.equals("softdrink")) {
      result = payment + price;
    }

    // 食事の注文
    if (category.equals("food")) {
      if (discount) {
        result = payment + price - 200;
      } else {
        result = payment + price;
      }
    }
    return result;
  }

  // 会計出力
  public void putsPayment(int payment) {
    System.out.println(payment);
  }
}

// -------------------------
//          模範解答
// -------------------------
// import java.util.ArrayList;
// import java.util.Scanner;

// class Customer {

//     static int numOfLeft = 0;
//     int amount;

//     Customer() {
//         amount = 0;
//     }

//     void takeFood(int m) {
//         amount += m;
//     }

//     void takeSoftDrink(int m) {
//         amount += m;
//     }

//     void takeAlcohol(int m) {}

//     void takeAlcohol() {
//         takeAlcohol(500);
//     }

//     void left() {
//         numOfLeft++;
//     }
// }

// class Adult extends Customer {

//     boolean drunk;

//     Adult() {
//         super();
//         drunk = false;
//     }

//     void takeFood(int m) {
//         if (drunk) {
//             m -= 200;
//         }
//         super.takeFood(m);
//     }

//     void takeAlcohol(int m) {
//         drunk = true;
//         amount += m;
//     }
// }

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int k = sc.nextInt();

//         ArrayList<Customer> customers = new ArrayList<>();

//         for (int i = 0; i < n; i++) {
//             int age = sc.nextInt();
//             if (age < 20) {
//                 customers.add(new Customer());
//             } else {
//                 customers.add(new Adult());
//             }
//         }

//         for (int i = 0; i < k; i++) {
//             int index = sc.nextInt() - 1;
//             String s = sc.next();

//             if (s.equals("0")) {
//                 customers.get(index).takeAlcohol();
//             } else if (s.equals("A")) {
//                 System.out.println(customers.get(index).amount);
//                 customers.get(index).left();
//             } else {
//                 int m = sc.nextInt();
//                 if (s.equals("food")) {
//                     customers.get(index).takeFood(m);
//                 } else if (s.equals("softdrink")) {
//                     customers.get(index).takeSoftDrink(m);
//                 } else if (s.equals("alcohol")) {
//                     customers.get(index).takeAlcohol(m);
//                 }
//             }
//         }

//         System.out.println(Customer.numOfLeft);
//     }
// }