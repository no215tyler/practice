const lines: string[] = [] // 入力バッファ
const isStaging: boolean = false;  // 手元環境(true) or 提出環境(false) のスイッチ
let a: number, b: number, c: number, d: number;

// ココで問題解く
const mainFunc = (lines: string[]): void => {
  [a, b, c ,d] = lines[0].split(' ').map(Number);
  console.log(((a + b) * c)**2 % d);
};

if (isStaging) {
    // 手元環境 入力行ごとの配列
    const inputLine: string[] = [
        "96 21 59 88"
    ];
    mainFunc(inputLine);
} else {
    // 提出環境 入力待ちにぶん投げる
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
