var __read = (this && this.__read) || function (o, n) {
    var m = typeof Symbol === "function" && o[Symbol.iterator];
    if (!m) return o;
    var i = m.call(o), r, ar = [], e;
    try {
        while ((n === void 0 || n-- > 0) && !(r = i.next()).done) ar.push(r.value);
    }
    catch (error) { e = { error: error }; }
    finally {
        try {
            if (r && !r.done && (m = i["return"])) m.call(i);
        }
        finally { if (e) throw e.error; }
    }
    return ar;
};
// https://paiza.jp/works/mondai/conditions_branch/conditions_branch__complex_boss/edit?language_uid=javascript
var lines = [];
var isStaging = false;
var a, b;
var mainFunc = function (lines) {
    var _a;
    //a ~ bの配列を作成
    _a = __read(lines[0].split(' ').map(Number), 2), a = _a[0], b = _a[1];
    switch (true) {
        // aが負の数でbが正の数: a * b が最小
        case a < 0 && b > 0:
            console.log(a * b);
            break;
        // aとbが両方負の数: b ** 2 が最小
        case a < 0 && b < 0:
            console.log(Math.pow(b, 2));
            break;
        // aが負の数でbが0: 0が最小
        case a < 0 && b == 0:
            console.log(0);
            break;
        // aが0でbが正の数: 0が最小
        case a == 0 && b < 0:
            console.log(0);
            break;
        // aとbが両方正の数: a ** 2 が最小
        case a > 0 && b > 0:
            console.log(Math.pow(a, 2));
            break;
        default:
            console.log(0);
    }
};
if (isStaging) {
    var inputLine = [
        "0 0"
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
// 15min
