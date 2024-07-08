const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (input) => {
  const nums = input.split(' ').map(Number);
  if (nums[0] == 1 && nums[1] == 1) {
    console.log(1);
  } else {
    console.log(0);
  }
  rl.close();
});
