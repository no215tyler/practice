function isString(value: any): value is string {
  return typeof value === "string";
}

function printValue(value: string|number): void {
  if (isString(value)) {
    console.log("String value:", value);
  } else {
    console.log("Non-string value:", value);
  }
}

printValue("hello"); // => String value: hello
printValue(42); // => Non-string value: 42
