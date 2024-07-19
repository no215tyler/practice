// ジェネリクスは関数やクラスが様々な型を扱えるようにするための機能


function identity<T>(value: T): T {
  return value;
}

console.log(identity(42)); // => 42
console.log(identity("hello")); // => "hello"
console.log(identity(true)); // => true
