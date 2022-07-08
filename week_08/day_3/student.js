// Constructor Functions

const Laptop = require('./laptop');

const Student = function (name) {
    this.name = name;
    this.laptop = null;
}

Student.prototype.greet = function(){
    console.log(`Hello, my name is ${this.name}`);
}

Student.prototype.buyLaptop = function(newLaptop){
    this.laptop = newLaptop;
}

const alice = new Student('Alice');
console.log(alice);
const newMac = new Laptop('Apple', 'iMac', 'iOS');
alice.buyLaptop(newMac);
console.log(alice);

