var lines = [];
var isStaging = false;
var nameAndAge = [];
var mainFunc = function (lines) {
    var N = parseInt(lines[0]);
    for (var i = 1; i <= N; i++) {
        nameAndAge.push(lines[i].split(' '));
    }
    for (var i = 0; i < nameAndAge.length; i++) {
        console.log("".concat(nameAndAge[i][0], " ").concat(Number(nameAndAge[i][1]) + 1));
    }
};
if (isStaging) {
    var inputLine = [
        "3",
        "Tanaka 18",
        "Sato 50",
        "Suzuki 120",
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
