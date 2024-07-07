const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let n, k;
const ary = [];
let readCount = 0;

rl.on('line', (line) => {
  if (!n) {
    [n, k] = line.split(' ').map(Number);
  } else {
    ary.push(parseInt(line));
    readCount++;
    if (readCount === n) {
      const count = ary.filter(num => num === k).length;
      console.log(count);
      rl.close();
    }
  }
});
