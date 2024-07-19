var lines = [];
var isStaging = false;
var n, k, t;


var mainFunc = function (lines) {
    var _a;
    _a = lines[0].split(' ').map(Number), n = _a[0], k = _a[1], t = _a[2];
    if (t / k >= n) {
        console.log('YES');
    }
    else {
        console.log('NO');
    }
};
if (isStaging) {
    var inputLine = [
        "4 2 7"
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
