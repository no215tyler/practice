// 1等：当選番号と一致する番号
// 前後賞：当選番号の ±1 の番号（当選番号が 100000 または 199999 の場合，前後賞は一つしかありません）
// 2等：当選番号と下 4 桁が一致する番号（1等に該当する番号を除く）
// 3等：当選番号と下 3 桁が一致する番号（1等および2等に該当する番号を除く）
const lines: string[] = []
const isStaging: boolean = true;

// 1時間15分 ＋ 1時間05分

function isHitNumber (winnerNum: number, num: number): void {
  const checkAdjacent = function(winnerNum: number, num: number): boolean {
    let resultAdjacentNum: number[] = [];
    if (winnerNum === 100000) {
      resultAdjacentNum = [100001];
    } else if (winnerNum === 199999) {
      resultAdjacentNum = [199998];
    } else {
      resultAdjacentNum = [winnerNum - 1, winnerNum + 1];
    }
    return resultAdjacentNum.some((adjacentNum: number) => (adjacentNum === num));
  };

  const second = function(winnerNum: number, num: number): boolean {
    const sliceWinnerNum: number = cutNums(winnerNum, 4);
    const secondNum: number = cutNums(num, 4);
    if (sliceWinnerNum === secondNum) {
      return true;
    } else {
      return false;
    }
  };
  
  const third = function(winnerNum: number, num: number): boolean {
    const sliceWinnerNum: number = cutNums(winnerNum, 3);
    const thirdNum: number = cutNums(num, 3);
    if (sliceWinnerNum === thirdNum) {
      return true;
    } else {
      return false;
    }
  };
  
  if (winnerNum === num) {
    console.log('first');
  } else if (checkAdjacent(winnerNum, num)) {
    console.log('adjacent');
  } else if (second(winnerNum, num)) {
    console.log('second');
  } else if (third(winnerNum, num)) {
    console.log('third');
  } else {
    console.log('blank');
  }
};

// スライス関数
const cutNums = (targetNums: number, index: number): number => {
  let sliceNums: number[] = [];
  sliceNums = targetNums.toString().split('').map(Number);
  let resultNums: number|number[] = [];
  for(let i: number = sliceNums.length - index; i < sliceNums.length; i++) {
    resultNums.push(sliceNums[i]);
  }
  return parseInt(resultNums.join(''))
}

const mainFunc = (lines: string[]) => {
    const N: number = parseInt(lines[1]);
    for (let i: number = 2; i < N + 2; i++) {
      isHitNumber(parseInt(lines[0]), parseInt(lines[i]))
    }
};

if (isStaging) {
    const inputLine: string[] = [
      "142358",
      "3",
      "195283",
      "167358",
      "142359",
    ];
    mainFunc(inputLine);
} else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    const reader: any = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', (line: string) => lines.push(line));
    reader.on('close', () => mainFunc(lines));
}
