const numbers = [1, 2, 3, 4, 5];

// Use map to have [2, 4, 6, 8, 10]
const doubledNumbers = numbers.map(n => n * 2);
console.log(numbers);
console.log(doubledNumbers);


// Filter the original array to have even numbers only.
const evenNumbers = numbers.filter(n => n % 2 == 0);
console.log(numbers);
console.log(evenNumbers);

// reduce 0 + 1 + 2 + 3 + 4 + 5
const initialValue = 0;
const sumWithInitial = numbers.reduce(
    (previousValue, currentValue) => previousValue + currentValue,
    initialValue
);

console.log(sumWithInitial);