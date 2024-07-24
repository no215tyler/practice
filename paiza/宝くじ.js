// 1等：当選番号と一致する番号
// 前後賞：当選番号の ±1 の番号（当選番号が 100000 または 199999 の場合，前後賞は一つしかありません）
// 2等：当選番号と下 4 桁が一致する番号（1等に該当する番号を除く）
// 3等：当選番号と下 3 桁が一致する番号（1等および2等に該当する番号を除く）
var lines = [];
var isStaging = false;

function isHitNumber(winnerNum, num) {
    var checkAdjacent = function (winnerNum, num) {
        var resultAdjacentNum = [];
        if (winnerNum === 100000) {
            resultAdjacentNum = [100001];
        }
        else if (winnerNum === 199999) {
            resultAdjacentNum = [199998];
        }
        else {
            resultAdjacentNum = [winnerNum - 1, winnerNum + 1];
        }
        return resultAdjacentNum.some(function (adjacentNum) { return (adjacentNum === num); });
    };
    var second = function (winnerNum, num) {
        var sliceWinnerNum = cutNums(winnerNum, 4);
        var secondNum = cutNums(num, 4);
        if (sliceWinnerNum === secondNum) {
            return true;
        }
        else {
            return false;
        }
    };
    var third = function (winnerNum, num) {
        var sliceWinnerNum = cutNums(winnerNum, 3);
        var thirdNum = cutNums(num, 3);
        if (sliceWinnerNum === thirdNum) {
            return true;
        }
        else {
            return false;
        }
    };
    if (winnerNum === num) {
        console.log('first');
    }
    else if (checkAdjacent(winnerNum, num)) {
        console.log('adjacent');
    }
    else if (second(winnerNum, num)) {
        console.log('second');
    }
    else if (third(winnerNum, num)) {
        console.log('third');
    }
    else {
        console.log('blank');
    }
}
;
// スライス関数
var cutNums = function (targetNums, index) {
    var sliceNums = [];
    sliceNums = targetNums.toString().split('').map(Number);
    var resultNums = [];
    for (var i = sliceNums.length - index; i < sliceNums.length; i++) {
        resultNums.push(sliceNums[i]);
    }
    return parseInt(resultNums.join(''));
};
var mainFunc = function (lines) {
    var N = parseInt(lines[1]);
    for (var i = 2; i < N + 2; i++) {
        isHitNumber(parseInt(lines[0]), parseInt(lines[i]));
    }
};
if (isStaging) {
    var inputLine = [
        "142358",
        "3",
        "195283",
        "167358",
        "142359",
    ];
    mainFunc(inputLine);
}
else {
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    var reader = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', function (line) { return lines.push(line); });
    reader.on('close', function () { return mainFunc(lines); });
}
