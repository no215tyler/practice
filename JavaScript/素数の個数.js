const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line) => {
  const num = Number(line);
  rl.close();
  const list = [2];
  for (let i = 3; i <= num; i++) {
    if (judgePrimeNumber(i)) {
      list.push(i);
    }
  }
  console.log(list.length);
});

const judgePrimeNumber = (num) => {
  for (let i = 2; i < num; i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
}
