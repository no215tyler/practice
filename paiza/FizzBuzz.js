var lines = [];
var isStaging = false;
var mainFunc = function (lines) {
    var num = parseInt(lines[0]);
    fizzbuzz(num);
};
var fizzbuzz = function (n) {
    for (var i = 1; i <= n; i++) {
        if (i % 5 == 0 && i % 3 == 0) {
            console.log('Fizz Buzz');
        }
        else if (i % 5 == 0) {
            console.log('Buzz');
        }
        else if (i % 3 == 0) {
            console.log('Fizz');
        }
        else {
            console.log(i);
        }
    }
};
if (isStaging) {
    var inputLine = [
        "20"
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
