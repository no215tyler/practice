var person = {
    name: "Alice",
    age: 25
};
var people = [
    { name: "Bob", age: 30 },
    { name: "Charlie", age: 35 }
];
function getPersonName(person) {
    return person.name;
}
;

console.log(getPersonName(person)); // => "Alice"
console.log(people.map(getPersonName)); // => ["Bob", "Charlie"]
