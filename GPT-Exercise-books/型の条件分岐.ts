type ProcessValue<T> = T extends string ? string : T extends number ? number : null;

function processValue<T>(value: T): ProcessValue<T>{
  if (typeof value === "string") {
    return value.toUpperCase() as ProcessValue<T>;
  } else if (typeof value === "number") {
    return value * 2 as ProcessValue<T>;
  } else {
    return null as ProcessValue<T>;
  }
}

console.log(processValue("hello")); // => "HELLO"
console.log(processValue(42)); // => 84
console.log(processValue(true)); // => null
