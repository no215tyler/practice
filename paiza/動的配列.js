// push_back x : A の末尾に x を追加する
// pop_back : A の末尾を削除する
// print : A を半角スペース区切りで1行に出力する
function runFunction(prompt, resultNums) {
    var n = prompt.split(' ').map(Number);
    switch (n[0]) {
        case 0:
            return resultNums.push(n[1]);
        case 1:
            return resultNums.pop();
        case 2:
            console.log(resultNums.join(' '));
    }
}
;
var lines = [];
var isStaging = false;
var resultNums = [];
var mainFunc = function (lines) {
    var N = parseInt(lines[0]);
    resultNums = lines[1].split(' ').map(Number);
    for (var i = 2; i < lines.length; i++) {
        runFunction(lines[i], resultNums);
    }
};
if (isStaging) {
    var inputLine = [
        "3 5",
        "1 2 3",
        "0 10",
        "0 12",
        "2",
        "1",
        "2"
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
