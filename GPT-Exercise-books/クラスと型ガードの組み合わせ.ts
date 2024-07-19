class Animal {
  name: string;
  constructor(name: string) {
    this.name = name;
  }
}

class Dog extends Animal {
  bark() {
    console.log("Woof!");
  }
}

class Cat extends Animal {
  meow() {
    console.log("Meow!");
  }
}

function makeSound(animal: Animal): void {
  if (animal instanceof Dog) {
    animal.bark();
  } else if (animal instanceof Cat) {
    animal.meow();
  } else {
    console.log("Unknown animal");
  }
}

const dog = new Dog("Rex");
const cat = new Cat("Whiskers");

makeSound(dog); // => "Woof!"
makeSound(cat); // => "Meow!"
