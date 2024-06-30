// 初級_JavaScript 練習問題

// 問題1 : 文字列 "Hello, World!" をコンソールに出力する JavaScript コードを書いてください。
console.log('Hello, World!');

// 問題2 : 変数 x に数値 10 を代入し、それをコンソールに出力する JavaScript コードを書いてください。
let x = 10;
console.log(x)

// 問題3 : 配列 [1, 2, 3, 4, 5] を作成し、3番目の要素をコンソールに出力する JavaScript コードを書いてください。
let array = [1, 2, 3, 4, 5]
console.log(array[2]);

// 問題4 : オブジェクト {name: 'Alice', age: 25} を作成し、オブジェクトの name プロパティをコンソールに出力する JavaScript コードを書いてください。
let object = {name: 'Alice', age: 25};
console.log(object.name);

// 問題5 : 数値 1 から 10 までをコンソールに出力する for ループを書いてください。
for (let i = 1; i <= 10; i++) {
  console.log(i)
};

// 問題6 : 数値の引数を受け取り、その数が偶数か奇数かを判定する関数 isEvenOrOdd を作成してください。結果をコンソールに出力してください。
const isEvenOrOdd = (n) => {
  if(n % 2 == 0) {
    console.log(`${n}は偶数です`)
  } else {
    console.log(`${n}は奇数です`)
  };
};

isEvenOrOdd(6);

// 問題7 : 文字列 "apple, banana, cherry" をカンマで分割し、それぞれのフルーツ名をコンソールに出力する JavaScript コードを書いてください。
let str = "apple, banana, cherry";
fruits = str.split(', ');
fruits.forEach (fruit => {
  console.log(fruit);
});

// 問題8 : x が 0 より大きい場合に "Positive" を、0 以下の場合に "Non-positive" をコンソールに出力する if-else 文を書いてください。
const checkPositiveNumber = (x) => {
  if(x > 0) {
    console.log('Positive') 
  } else {
    console.log('Non-positive')
  };
};

checkPositiveNumber(3);
checkPositiveNumber(-2);

// 問題9 : 配列 [5, 10, 15, 20, 25] の各要素を 2 倍にして新しい配列を作成し、その新しい配列をコンソールに出力する JavaScript コードを書いてください。
const numbers = [5, 10, 15, 20, 25];
const doubleNumbers = [];
numbers.forEach(n => {
  doubleNumbers.push(n * 2)
});
console.log(doubleNumbers);
