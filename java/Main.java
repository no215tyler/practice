import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String[] inputNum = sc.nextLine().split(" ");
    int A = Integer.parseInt(inputNum[0]);
    int B = Integer.parseInt(inputNum[1]);

    int N = 10000;
    N /= A;
    N %= B;
    System.out.println(N);

    sc.close();
  }
}
