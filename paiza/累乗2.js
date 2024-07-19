var lines = []; // 入力バッファ
var isStaging = true; // 手元環境(true) or 提出環境(false) のスイッチ
var a, b, c, d;
// ココで問題解く
var mainFunc = function (lines) {
    var _a;
    _a = lines[0].split(' ').map(Number), a = _a[0], b = _a[1], c = _a[2], d = _a[3];
    console.log(Math.pow(((a + b) * c), 2) % d);
};
if (isStaging) {
    // 手元環境 入力行ごとの配列
    var inputLine = [
        "96 21 59 88"
    ];
    mainFunc(inputLine);
}
else {
    // 提出環境 入力待ちにぶん投げる
    process.stdin.resume();
    process.stdin.setEncoding('utf8');
    var reader = require('readline').createInterface({ input: process.stdin, output: process.stdout });
    reader.on('line', function (line) { return lines.push(line); });
    reader.on('close', function () { return mainFunc(lines); });
}
