// push_back x : A の末尾に x を追加する
// pop_back : A の末尾を削除する
// print : A を半角スペース区切りで1行に出力する

function runFunction(prompt: string, resultNums: number[]) {
  let n: number[] = prompt.split(' ').map(Number);
  switch (n[0]) {
    case 0:
      return resultNums.push(n[1]);
    case 1:
      return resultNums.pop();
    case 2:
      console.log(resultNums.join(' '));
  }

};

const lines: string[] = []
const isStaging: boolean = true;
let resultNums: number[] = [];


const mainFunc = (lines: string[]): void => {
  const N: number = parseInt(lines[0]);
  resultNums = lines[1].split(' ').map(Number);
  for (let i: number = 2; i < lines.length; i++) {
    runFunction(lines[i], resultNums);
  }
};

if (isStaging) {
    const inputLine: string[] = [
        "3 5",
        "1 2 3",
        "0 10",
        "0 12",
        "2",
        "1",
        "2"
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
