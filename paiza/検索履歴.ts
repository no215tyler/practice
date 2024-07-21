const lines: string[] = []
const isStaging: boolean = true; // 手元環境(true) or 提出環境(false) のスイッチ
let tempAry: string[] = [];
let resultAry: string[] = [];

const mainFunc = (lines: string[]): void => {
    const N: number = parseInt(lines[0]);
    for (let i: number = 1; i <= N; i++) {
      tempAry.push(lines[i]);
    }
    tempAry.forEach((str: string) => {
      if (resultAry.includes(str)) {
        const index = resultAry.indexOf(str);
        resultAry.splice(index, 1);
      }
      resultAry.unshift(str);
    })
    resultAry.forEach((str: string) => {
      console.log(str);
    })
};

if (isStaging) {
    const inputLine: string[] = [
        "5",
        "book",
        "candy",
        "apple",
        "book",
        "candy"
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
