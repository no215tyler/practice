const lines: string[] = []
const isStaging: boolean = true;  // 手元環境(true) or 提出環境(false) のスイッチ
const nameAndAge: (string[]|number[])[] = [];

const mainFunc = (lines: string[]): void => {
  const N: number = parseInt(lines[0]);
  for (let i: number = 1; i <= N; i++) {
    nameAndAge.push(lines[i].split(' '))
  }
  for (let i: number = 0; i < nameAndAge.length; i++) {
    console.log(`${nameAndAge[i][0]} ${Number(nameAndAge[i][1]) + 1}`)
  }
};

if (isStaging) {
    const inputLine: string[] = [
      "3",
      "Tanaka 18",
      "Sato 50",
      "Suzuki 120",
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
