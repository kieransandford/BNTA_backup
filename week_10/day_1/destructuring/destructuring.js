const numbers = [1, 2, 3, 4, 5];

const OtherNumbers = [...numbers];

const [firstNumber, secondNumber, ...remainingNumbers] = numbers;


// console.log("first number:", numbers[0]);
// console.log("first number destructured:", firstNumber);
// console.log("second number:", numbers[1]);
// console.log("second number destructured:", secondNumber);
// console.log("remaining numbers:", remainingNumbers);

const person = {
    name: "Kieran",
    age: 26,
    homeTown: "Sutton Coldfield",
    favouriteColour: "red"
}

const {name, age, homeTown, favouriteColour} = person;

console.log(name);
console.log(homeTown);
