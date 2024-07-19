var lines = [];
var isStaging = true;
var mainFunc = function (lines) {
    lines.forEach(function (str) {
        console.log(str);
    });
};
if (isStaging) {
    var inputLine = [
        "paiza0",
        "paiza1",
        "paiza3"
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
