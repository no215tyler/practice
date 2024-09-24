import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String trgt = sc.nextLine();
    String[] strs = sc.nextLine().split("");

    long count = Arrays.stream(strs).filter(s -> s.equals(trgt)).count();
    System.out.println(count);

    sc.close();
  }
}
