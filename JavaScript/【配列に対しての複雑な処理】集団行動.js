const readline = require('readline');

const swap = (list, a, b) => {
  const bufNum = list[a - 1];
  list[a - 1] = list[b - 1];
  list[b - 1] = bufNum;
  return list;
};

const reverse = (list) => {
  return list.reverse();
};

const resize = (list, c) => {
  let newList = [];
  if (list.length <= c) {
    return list;
  }
  for (let i = 0; i < c; i++) {
    newList.push(list[i]);
  }
  return newList;
};

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

let n, input;
let inputCount = 0;
let group = [];

rl.on('line', (line) => {
  if (!n) {
    [n, input] = line.split(' ').map(Number);
    group = Array.from({ length: n}, (_, i) => i + 1);
  } else {
    const prompt = line.split(' ');
    if (prompt[0] == 'swap') {
      group = swap(group, prompt[1], prompt[2]);
    } else if (prompt[0] == 'reverse') {
      group = reverse(group);
    } else if (prompt[0] == 'resize') {
      group = resize(group, prompt[1])
    }
    inputCount++;
  }
  if (inputCount == input) {
    rl.close();
  }
}).on('close', () => {
  console.log(group.join('\n'));
});
