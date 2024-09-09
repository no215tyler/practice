import java.util.*;
import java.math.BigInteger;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    BigInteger S = sc.nextBigInteger();
    BigInteger T = sc.nextBigInteger();
    BigInteger result = S.multiply(T);

    System.out.println(result);

    sc.close();
  }
}
