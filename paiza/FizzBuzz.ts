const lines: string[] = []
const isStaging: boolean = true;

const mainFunc = (lines: string[]) => {
  const num: number = parseInt(lines[0]);
  fizzbuzz(num);
};

const fizzbuzz = (n: number): void => {
  for (let i: number = 1; i <= n; i++) {
    if (i % 5 == 0 && i % 3 == 0) {
      console.log('Fizz Buzz');
    } else if (i % 5 == 0) {
      console.log('Buzz');
    } else if (i % 3 == 0) {
      console.log('Fizz');
    } else {
      console.log(i);
    }
  }
};

if (isStaging) {
    const inputLine: string[] = [
        "20"
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
