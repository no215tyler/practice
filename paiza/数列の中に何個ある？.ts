const lines: string[] = []
const isStaging: boolean = true;

const mainFunc = (lines: string[]) => {
  const nums: number[] = lines[1].split(' ').map(Number);
  let count: number = nums.filter(num => num == 1).length;
  console.log(count);
};

if (isStaging) {
    const inputLine: string[] = [
        "5",
        "1 1 1 3 1"
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
