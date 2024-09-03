import java.util.*;
import java.text.NumberFormat;
import java.math.BigInteger;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    BigInteger num = sc.nextBigInteger();
    NumberFormat nfNum = NumberFormat.getNumberInstance();
    System.out.println(nfNum.format(num));
    sc.close();
  }
}