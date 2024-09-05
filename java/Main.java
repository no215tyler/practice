import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());
    System.out.println(String.format("%03d", num));
    sc.close();
  }
}
