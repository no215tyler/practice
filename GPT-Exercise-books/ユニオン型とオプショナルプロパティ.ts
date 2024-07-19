// function formatValue(value) {
//   if (typeof value === "number") {
//     return value.toFixed(2);
//   } else if (typeof value === "string") {
//     return value.toUpperCase();
//   } else {
//     return value;
//   }
// }

// console.log(formatValue(10.123)); // => "10.12"
// console.log(formatValue("hello")); // => "HELLO"
// console.log(formatValue(true)); // => true

type isStringOrBoolean = string|boolean;

function formatValue(value: isStringOrBoolean|number): isStringOrBoolean {
  if (typeof value === "number") {
    return value.toFixed(2);
  } else if (typeof value === "string") {
    return value.toUpperCase();
  } else {
    return value;
  }
}

console.log(formatValue(10.123)); // => "10.12"
console.log(formatValue("hello")); // => "HELLO"
console.log(formatValue(true)); // => true
