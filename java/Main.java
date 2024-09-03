import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String local = sc.nextLine();
    String domain = sc.nextLine();
    System.out.println(String.format("%s@%s", local, domain));
    sc.close();
  }
}
