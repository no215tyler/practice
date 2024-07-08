// 参考記事： https://qiita.com/cotton11aq/items/a8b93d61fca8f83ffaae

// #######################
// 標準入力の受け取り方基本形
// #######################
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
function main(input) {
  const a = input.split(" ");  // 入力

  // コードを入れる

  console.log(a); // 出力
}

main(require("fs").readFileSync("/dev/stdin", "utf8"));
// ━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
// readlineモジュールをインポート
const readline = require('readline');

// readlineインターフェースを作成
const rl = readline.createInterface({
  input: process.stdin, // 標準入力（通常はキーボード入力）を設定
  output: process.stdout // 標準出力（通常はコンソール出力）を設定
});

// ユーザーに入力を促し、入力が行われるとコールバック関数が実行される
rl.question('Enter a number: ', (answer) => {
  // ユーザーの入力（文字列）を整数に変換
  const n = parseInt(answer);
  // 変換された整数をコンソールに出力
  console.log(n);
  // rl.close(); // readlineインターフェースを閉じる
});

// ##############################
// 標準入力の別解 （onメソッドの使用）
// ##############################
rl.on('line', (input) => {
  let str = input;
  console.log(str);
  // rl.close(); // readlineインターフェースを閉じる
});



