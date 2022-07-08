const Car = require('./car');

// describe('retrieve properties', () => {

    test('can retrieve manufacturer', () => {
        let car1 = new Car('BMW', '45000', 'Petrol');
        
        expect(car1.manufacturer).toBe('BMW')
        expect(car1.price).toBe('45000')
        expect(car1.engineType).toBe('Petrol')
        
    });

// });