var lines = [];
var isStaging = true; // 手元環境(true) or 提出環境(false) のスイッチ
var aryA = [];
var aryB = [];
var calculateAryA = [];
var calculateAryB = [];
var resultAry = [];
var mainFunc = function (lines) {
    aryA = lines[1].split(' ').map(Number);
    aryB = lines[2].split(' ').map(Number);
    calculateAryA.push(Math.max.apply(Math, aryA));
    calculateAryA.push(Math.min.apply(Math, aryA));
    calculateAryB.push(Math.max.apply(Math, aryB));
    calculateAryB.push(Math.min.apply(Math, aryB));
    calculateAryA.forEach(function (num1, i) {
        calculateAryB.forEach(function (num2, j) {
            resultAry.push(num1 * num2);
        });
    });
    console.log(Math.max.apply(Math, resultAry));
};
if (isStaging) {
    var inputLine = [
        "99 97",
        "56 89 -38 -91 27 -18 57 67 26 -25 62 -94 -57 37 -39 -48 -68 47 73 -55 32 -46 -76 55 -28 9 -75 -21 -87 -6 -51 98 67 -46 90 -19 -90 -19 -82 -80 55 -36 -85 50 -76 65 97 -25 -24 83 -50 -36 30 -62 -13 95 80 74 54 21 -21 26 80 96 -4 4 -77 99 63 -3 55 -76 -7 71 42 -66 -20 66 20 -56 84 87 -71 -100 -99 40 -100 40 47 -100 45 -90 -9 -93 -92 -82 -47 -56 10",
        "78 -61 87 -46 57 -58 -77 58 10 30 2 -54 85 -79 -53 58 -46 -51 -58 4 -69 9 10 -27 6 -2 18 -36 32 46 41 -86 -86 -84 54 -69 -56 -28 -55 81 -22 1 -61 -39 52 -40 -77 86 28 89 39 -35 -70 53 -73 91 2 -60 31 59 35 -45 -78 73 40 -77 53 -7 -94 92 -18 -74 -22 -23 -97 -21 -93 72 58 5 81 -81 3 90 -10 54 -55 -5 -58 43 -63 60 58 -81 25 -53 36"
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
