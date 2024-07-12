import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line: string) => {
  const [n, k] = line.split(' ').map(Number);
  rl.on('line', (line2: string) => {
    const arr = line2.split(' ').map(Number);
    rl.close();
    console.log(arr[k - 1]);
  })
})

