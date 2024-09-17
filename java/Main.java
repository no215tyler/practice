// 問題 17: ファイル読み込みの例外処理
// ユーザーからファイル名を入力してもらい、そのファイルを読み込むプログラムを作成してください。
// ファイルが存在しない場合、`FileNotFoundException`を処理して適切なエラーメッセージを表示するようにしてください。
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("読み込むファイル名を入力してください: ");
        String filename = inputScanner.nextLine();

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                System.out.println(fileScanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("ファイルが見つかりません: " + e.getMessage());
        }
    }
}