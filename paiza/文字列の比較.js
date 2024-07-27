var lines = [];
var isStaging = false;
var mainFunc = function (lines) {
    var strAry = lines[0].split(' ');
    console.log(strAry[0] == strAry[1]);
};
if (isStaging) {
    var inputLine = [
        "abc abc",
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
