import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let inputLines: number[][] = [];
let n: number, m:number, k:number, l:number;
let lineCount: number = 0;

rl.on('line', (line) => {
  if (lineCount === 0) {
    [n, m, k, l] = line.split(' ').map(Number);
    lineCount++;
  } else {
    inputLines.push(line.split(' ').map(Number));
    lineCount++;
    if (lineCount === n + 1) {
      console.log(inputLines[k - 1][l - 1]);
      rl.close();
    }
  }
})

// 35min + 
