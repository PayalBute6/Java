// 3. Import the functions from our module file
import { add, subtract, multiply, divide } from './mathOperations.mjs';

console.log("--- Testing Math Module ---");

let num1 = 100;
let num2 = 25;

// 4. Perform all operations using the imported functions
console.log("Addition (100 + 25) = " + add(num1, num2));
console.log("Subtraction (100 - 25) = " + subtract(num1, num2));
console.log("Multiplication (100 * 25) = " + multiply(num1, num2));
console.log("Division (100 / 25) = " + divide(num1, num2));
