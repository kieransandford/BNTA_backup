const Car = function (make, model) {
    this.make = make;
    this.model = model;
}

Car.prototype.whatCar = function(){
    console.log(`The make is ${this.make}, and the model is ${this.model}`);
}

const bmw4Series = new Car('BMW', '4 Series');
bmw4Series.whatCar();
const audiA3 = new Car('Audi', 'A3');
audiA3.whatCar();
