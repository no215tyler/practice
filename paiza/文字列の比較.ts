const lines: string[] = []
const isStaging: boolean = false;


const mainFunc = (lines: string[]): void => {
  const strAry: string[] = lines[0].split(' ')
  console.log(strAry[0] == strAry[1]);
};

if (isStaging) {
    const inputLine: string[] = [
        "abc abc",
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
