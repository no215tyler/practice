// https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_boss/edit?language_uid=javascript
const lines: string[] = []
const isStaging: boolean = false;
let a: number, b: number;

const mainFunc = (lines: string[]) => {
  //a ~ bの配列を作成
  [a, b] = lines[0].split(' ').map(Number);
  switch (true) {
    // aが負の数でbが正の数: a * b が最小
    case a < 0 && b > 0:
      console.log(a * b);
      break;
    // aとbが両方負の数: b ** 2 が最小
    case a < 0 && b < 0:
      console.log(b ** 2);
      break;
    // aが負の数でbが0: 0が最小
    case a < 0 && b == 0:
      console.log(0);
      break;
    // aが0でbが正の数: 0が最小
    case a == 0 && b < 0:
      console.log(0);
      break;
    // aとbが両方正の数: a ** 2 が最小
    case a > 0 && b > 0:
      console.log(a ** 2);
      break;
    default:
      console.log(0);
  }
};

if (isStaging) {
    const inputLine: string[] = [
        "0 0" 
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
