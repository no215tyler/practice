interface Person {
  name: string,
  age: number
}

const person: Person = {
  name: "Alice",
  age: 25
};

const people: Person[] = [
  { name: "Bob", age: 30 },
  { name: "Charlie", age: 35 }
];

function getPersonName(person: Person): string {
  return person.name;
};

// アロー関数で書く場合
// const getPersonName = (person: Person): string => {
//   return person.name;
// };

console.log(getPersonName(person)); // => "Alice"
console.log(people.map(getPersonName)); // => ["Bob", "Charlie"]
