console.log("name: Taira Nobuhiko\nlanguage: Ruby, JavaScript, Japanese\n一言: Hello!")

const readline = require('readline');
const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout
});

rl.on('line', (input) => {
  temp = input.split(' ');
  temp.forEach(names => {
    console.log(names);
  });
  rl.close();
});

