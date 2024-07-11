import * as readline from 'readline';

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (line: string) => {
  rl.close();
  const words: string[] = line.split(' ');
  words.forEach(word => {
    if (hash[word]) {
      hash[word] += 1;
    } else {
      hash[word] = 1;
    }
  })
  Object.entries(hash).forEach(([key, val]) => {
    console.log(`${key} ${val}`);
  })
});

const hash: { [key: string]: number} = {};
