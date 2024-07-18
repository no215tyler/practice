import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let lineCount: number = 0;
let s: string;
let t: number;

rl.on('line', (line: string) => {
  if (lineCount === 0) {
    s = line;
    lineCount++;
  } else {
    t = parseInt(line, 10);
    lineCount++;
    if (lineCount === 2) {
      rl.close();
      console.log(multiplyBigNumber(s, t));
    }
  }
});

function multiplyBigNumber(s: string, t: number): string {
  if (t === 0) {
    return '0';
  }

  let ans = "";
  let upper = 0;

  for (let i = s.length - 1; i >= 0; i--) {
    const z = parseInt(s[i], 10) * t + upper;
    upper = Math.floor(z / 10);
    ans = (z % 10).toString() + ans;

    if (i === 0 && upper > 0) {
      ans = upper.toString() + ans;
    }
  }

  return ans;
}
