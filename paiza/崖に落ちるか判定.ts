const lines: string[] = []
const isStaging: boolean = false;
let n:number, k: number, t: number;

// N: 歩数, K: 1歩の距離, T: 現在地から崖までの距離

const mainFunc = (lines: string[]): void => {
  [n, k, t] = lines[0].split(' ').map(Number);
  if (t / k >= n) {
    console.log('YES');
  } else {
    console.log('NO');
  }
};

if (isStaging) {
    const inputLine: string[] = [
        "4 2 7"
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
