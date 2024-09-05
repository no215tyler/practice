import java.util.*;
import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("000");
    int num = Integer.parseInt(sc.nextLine());
    System.out.println(df.format(num));
    sc.close();
  }
}

// 模範解答
// import java.util.*;

// public class Main {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();

//         System.out.printf("%03d\n", n);

//         sc.close();
//     }
// }