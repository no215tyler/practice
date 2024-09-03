import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = new String[10];
    strNums = sc.nextLine().split(" ");
    String result = String.join(",", strNums);
    System.out.println(String.format("%s,", result));
    sc.close();
  }
}