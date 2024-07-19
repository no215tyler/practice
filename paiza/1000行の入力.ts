const lines: string[] = []
const isStaging: boolean = true;

const mainFunc = (lines: string[]): void => {
  lines.forEach(str => {
    console.log(str);
  })
};

if (isStaging) {
    const inputLine: string[] = [
        "paiza0",
        "paiza1",
        "paiza2",
        "paiza3"
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
