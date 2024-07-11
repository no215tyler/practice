// TypeScriptでは、モジュールのインポートにimport文を使用します。
// JavaScriptのrequireに相当しますが、よりモダンな方法です。
import * as readline from 'readline';

// readlineインターフェースを作成します。
// これは標準入力（input）と標準出力（output）を使用します。
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

// 'line'イベントが発生したときに実行されるコールバック関数を定義します。
// lineはstring型であることを明示しています（TypeScriptの型注釈）。
rl.on('line', (line: string) => {
  // 入力行を数値に変換します。
  const num = Number(line);
  // readlineインターフェースを閉じます。
  rl.close();
  // 素数を格納するためのリストを初期化します。
  const list: number[] = [2];
  // 3からnumまでの数について素数かどうかを判定します。
  for (let i = 3; i <= num; i++) {
    // 素数であればリストに追加します。
    if (judgePrimeNumber(i)) {
      list.push(i);
    }
  }
  // 素数の数を出力します。
  console.log(list.length);
});

// 素数を判定する関数を定義します。
// numはnumber型で、戻り値はboolean型であることを明示しています。
const judgePrimeNumber = (num: number): boolean => {
  // 2からnum-1までの数で割り切れるかどうかを調べます。
  for (let i = 2; i < num; i++) {
    // 割り切れた場合は素数ではないのでfalseを返します。
    if (num % i === 0) {
      return false;
    }
  }
  // 割り切れない場合は素数なのでtrueを返します。
  return true;
}
