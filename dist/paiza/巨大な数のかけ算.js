"use strict";
var __createBinding = (this && this.__createBinding) || (Object.create ? (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    var desc = Object.getOwnPropertyDescriptor(m, k);
    if (!desc || ("get" in desc ? !m.__esModule : desc.writable || desc.configurable)) {
      desc = { enumerable: true, get: function() { return m[k]; } };
    }
    Object.defineProperty(o, k2, desc);
}) : (function(o, m, k, k2) {
    if (k2 === undefined) k2 = k;
    o[k2] = m[k];
}));
var __setModuleDefault = (this && this.__setModuleDefault) || (Object.create ? (function(o, v) {
    Object.defineProperty(o, "default", { enumerable: true, value: v });
}) : function(o, v) {
    o["default"] = v;
});
var __importStar = (this && this.__importStar) || function (mod) {
    if (mod && mod.__esModule) return mod;
    var result = {};
    if (mod != null) for (var k in mod) if (k !== "default" && Object.prototype.hasOwnProperty.call(mod, k)) __createBinding(result, mod, k);
    __setModuleDefault(result, mod);
    return result;
};
Object.defineProperty(exports, "__esModule", { value: true });
const readline = __importStar(require("readline"));
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});
let lineCount = 0;
let s;
let t;
rl.on('line', (line) => {
    if (lineCount === 0) {
        s = line;
        lineCount++;
    }
    else {
        t = parseInt(line, 10);
        lineCount++;
        if (lineCount === 2) {
            rl.close();
            console.log(multiplyBigNumber(s, t));
        }
    }
});
function multiplyBigNumber(s, t) {
    if (t === 0) {
        return '0';
    }
    let ans = "";
    let upper = 0;
    for (let i = s.length - 1; i >= 0; i--) {
        const z = parseInt(s[i], 10) * t + upper;
        upper = Math.floor(z / 10);
        ans = (z % 10).toString() + ans;
        if (i === 0 && upper > 0) {
            ans = upper.toString() + ans;
        }
    }
    return ans;
}
