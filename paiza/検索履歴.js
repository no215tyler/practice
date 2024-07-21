var lines = [];
var isStaging = false;
var tempAry = [];
var resultAry = [];
var mainFunc = function (lines) {
    var N = parseInt(lines[0]);
    for (var i = 1; i <= N; i++) {
        tempAry.push(lines[i]);
    }
    tempAry.forEach(function (str) {
        if (resultAry.includes(str)) {
            var index = resultAry.indexOf(str);
            resultAry.splice(index, 1);
        }
        resultAry.unshift(str);
    });
    resultAry.forEach(function (str) {
        console.log(str);
    });
};
if (isStaging) {
    var inputLine = [
        "5",
        "book",
        "candy",
        "apple",
        "book",
        "candy"
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
