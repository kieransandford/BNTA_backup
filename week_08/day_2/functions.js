// Named function

const greeting = greet("afternoon", "Colin");

// console.log(greeting);

function greet(timeOfDay, name){
    return `Good ${timeOfDay}, ${name}!`;
}

// Anonymous Functions

const sum = function (number1, number2){
    return number1 + number2;
}

const total = sum(1, 2);

// console.log(total);

// Arrow Function

const multiply = (number1, number2) => {
    return number1 * number2;
}

const product = multiply(4,5);

console.log(product);

