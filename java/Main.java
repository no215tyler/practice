import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      List<Double> mpq = Arrays.stream(sc.nextLine().split(" "))
                        .map(Double::parseDouble)
                        .collect(Collectors.toList());


      Double result = (mpq.get(0) * (1 - mpq.get(1) / 100)) * (1 - mpq.get(2) / 100);

      System.out.println(result);

      sc.close();
    }
}