import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] strNums = sc.nextLine().split(" ");
    double floatNum = Double.parseDouble(strNums[0]);
    int n = Integer.parseInt(strNums[1]);
    System.out.println(String.format("%." + n + "f", floatNum));
    sc.close();
  }
}