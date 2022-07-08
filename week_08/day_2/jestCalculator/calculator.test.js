const {sum, isEven} = require('./calculator');

describe('addition functionality', () => {

    test('can add two small positive numbers', () => {
        // Arrange - do any setup
        // Act - call the function under test
        const actual = sum(2, 3);
        // Assert - call the assertion method
        const expected = 5;
        expect(actual).toBe(expected);
        // expect(sum(2, 3)).toBe(5);
    });

    test('2 is even', () => {
        expect(isEven(2)).toBe(true);
    });

})