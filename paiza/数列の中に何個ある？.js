var lines = [];
var isStaging = true;
var mainFunc = function (lines) {
    var nums = lines[1].split(' ').map(Number);
    var count = nums.filter(function (num) { return num == 1; }).length;
    console.log(count);
};
if (isStaging) {
    var inputLine = [
        "5",
        "1 1 1 3 1"
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
