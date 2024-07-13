import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (inputNum: number) => {
  rl.on('line', (aryNums: string) => {
    rl.close();
    const nums: number[] = aryNums.split(' ').map(Number);
    nums.forEach(n => {
      console.log(evenOrOdd(n));
    })
  });
});

const evenOrOdd = (num: number): string => {
  if (num % 2 == 0) {
    return 'even'
  } else {
    return 'odd'
  }
};
