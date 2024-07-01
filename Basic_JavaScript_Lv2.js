// 少し難易度を上げた JavaScript 練習問題
// ######################################################################################################
// 問題10
// 文字列の配列 ["apple", "banana", "cherry", "date"] の中で、
// 文字数が5文字以上のものだけを新しい配列に格納し、その新しい配列をコンソールに出力するJavaScript コードを書いてください。
// ######################################################################################################

const lists = ["apple", "banana", "cherry", "date"];
newLists = [];
lists.forEach(str => {
  if (str.length >= 5) {
    newLists.push(str);
  };
});
console.log(newLists);

// ######################################################################################################
// 問題11
// オブジェクトの配列 [{name: "Alice", age: 25}, {name: "Bob", age: 30}, {name: "Charlie", age: 35}] があります。
// この中で、age プロパティの値が30以上のオブジェクトだけを含む新しい配列を作成し、その新しい配列をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################

const objects = [
  {name: "Alice", age: 25},
  {name: "Bob", age: 30},
  {name: "Charlie", age: 35}
];

const over30Lists = objects.filter(human => human.age >= 30);

console.log(over30Lists);

// 別解 （filterメソッドを利用する）
// const objects = [
  //   {name: "Alice", age: 25},
  //   {name: "Bob", age: 30},
  //   {name: "Charlie", age: 35}
  // ];
  
  // const over30Lists = objects.filter(human => human.age >= 30);
  
  // console.log(over30Lists);
  
// ######################################################################################################
// 問題12
// 次のようなオブジェクトがあります。
// const person = {
//   name: "John",
//   age: 30,
//   hobbies: ["reading", "traveling", "swimming"]
// };
// このオブジェクトの hobbies プロパティの配列内の各要素を大文字に変換した新しい配列を作成し、
// その新しい配列をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const person = {
  name: "John",
  age: 30,
  hobbies: ["reading", "traveling", "swimming"]
};
hobbiesUpperCase = [];
person.hobbies.forEach (hobby => {
  hobbiesUpperCase.push(hobby.toUpperCase());
});
console.log(hobbiesUpperCase);

// ######################################################################################################
// 問題13
// 数値の配列 [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] があります。
// この配列から偶数だけを含む新しい配列を作成し、その新しい配列をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const evenAry = numbers.filter(num => (num % 2) == 0)
console.log(evenAry);

// ######################################################################################################
// 問題14
// 次のようなオブジェクトがあります。
// const students = [
//   { name: "Alice", score: 85 },
//   { name: "Bob", score: 92 },
//   { name: "Charlie", score: 88 },
//   { name: "Dave", score: 79 }
// ];
// このオブジェクトの配列から、score プロパティの値が 80 以上の学生の名前だけを含む新しい配列を作成し、
// その新しい配列をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const students = [
  { name: "Alice", score: 85 },
  { name: "Bob", score: 92 },
  { name: "Charlie", score: 88 },
  { name: "Dave", score: 79 }
];
let over80scores = [];
students.forEach(student => {
  if (student.score >= 80) {
    over80scores.push(student.name);
  };
});
console.log(over80scores);

// ######################################################################################################
// 問題15
// 次のような数値の配列があります。
// const numbers = [1, -2, 3, -4, 5, -6, 7, -8, 9, -10];
// この配列の各要素を絶対値に変換した新しい配列を作成し、その新しい配列をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const nonPositiveNumbers = [1, -2, 3, -4, 5, -6, 7, -8, 9, -10];
absNumbers = [];
nonPositiveNumbers.forEach(num => {
  absNumbers.push(Math.abs(num));
});
console.log(absNumbers);

// ######################################################################################################
// 問題16
// 次のようなオブジェクトがあります。
// const inventory = [
//   { item: "apple", quantity: 5 },
//   { item: "banana", quantity: 10 },
//   { item: "cherry", quantity: 0 },
//   { item: "date", quantity: 7 }
// ];
// このオブジェクトの配列から、quantity プロパティの値が 1 以上のアイテム名だけを含む新しい配列を作成し、
// その新しい配列をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const inventory = [
  { item: "apple", quantity: 5 },
  { item: "banana", quantity: 10 },
  { item: "cherry", quantity: 0 },
  { item: "date", quantity: 7 }
];
let stockItem = [];
inventory.forEach(item => {
  if (item.quantity > 0) {
    stockItem.push(item.item);
  };
});
console.log(stockItem);

// ######################################################################################################
// 問題17
// 次のような数値の配列があります。
// const numbers01 = [4, 9, 16, 25, 36];
// この配列の各要素の平方根を含む新しい配列を作成し、その新しい配列をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const numbers01 = [4, 9, 16, 25, 36];
const calcSqrt = (x) => {
  return Math.sqrt(x);
};
const sqrtNumbers = [];
numbers01.forEach(num => {
  sqrtNumbers.push(calcSqrt(num))
});
console.log(sqrtNumbers);

// ######################################################################################################
// 問題18
// 次のようなオブジェクトがあります。
// const people = [
//   { name: "Alice", age: 25 },
//   { name: "Bob", age: 17 },
//   { name: "Charlie", age: 19 },
//   { name: "Dave", age: 16 }
// ];
// このオブジェクトの配列から、age プロパティの値が 18 以上の人の名前をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const people = [
  { name: "Alice", age: 25 },
  { name: "Bob", age: 17 },
  { name: "Charlie", age: 19 },
  { name: "Dave", age: 16 }
];
people.forEach(human => {
  if (human.age >= 18) {
    console.log(human.name);
  };
});

// ######################################################################################################
// 問題19
// 次のような文字列があります。
// const str = "The quick brown fox jumps over the lazy dog";
// この文字列の各単語の最初の文字だけを取り出して連結した新しい文字列を作成し、その新しい文字列をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const str = "The quick brown fox jumps over the lazy dog";
const wordsArray = str.split(' ');
let initialStr = [];
wordsArray.forEach(word => {
  initialStr.push(word.slice(0, 1));
});
initialStr = initialStr.join('');
console.log(initialStr);

// ######################################################################################################
// 問題20
// 次のようなオブジェクトがあります。
// const transactions = [
//   { id: 1, amount: 100, type: "deposit" },
//   { id: 2, amount: 50, type: "withdrawal" },
//   { id: 3, amount: 200, type: "deposit" },
//   { id: 4, amount: 150, type: "withdrawal" }
// ];
// このオブジェクトの配列から、type プロパティが "deposit" のトランザクションの amount プロパティの合計を計算し、
// その合計をコンソールに出力する JavaScript コードを書いてください。
// ######################################################################################################
const transactions = [
  { id: 1, amount: 100, type: "deposit" },
  { id: 2, amount: 50, type: "withdrawal" },
  { id: 3, amount: 200, type: "deposit" },
  { id: 4, amount: 150, type: "withdrawal" }
];
let sum = 0;
transactions.forEach(transaction => {
  if (transaction.type == "deposit") {
    sum += transaction.amount;
  };
});
console.log(sum);
