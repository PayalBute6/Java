// Question: Write a JavaScript program to demonstrate Arrow Functions for addition, subtraction, multiplication and division.

// 1. Arrow function for Addition
const add = (a, b) => a + b;

// 2. Arrow function for Subtraction
const subtract = (a, b) => a - b;

// 3. Arrow function for Multiplication
const multiply = (a, b) => a * b;

// 4. Arrow function for Division
const divide = (a, b) => a / b;

// Let's test them with two numbers
let num1 = 20;
let num2 = 5;

// Calculate results by calling the arrow functions
let resultAdd = add(num1, num2);
let resultSub = subtract(num1, num2);
let resultMul = multiply(num1, num2);
let resultDiv = divide(num1, num2);

// Print the results to the console
console.log("Addition (20 + 5) = " + resultAdd);
console.log("Subtraction (20 - 5) = " + resultSub);
console.log("Multiplication (20 * 5) = " + resultMul);
console.log("Division (20 / 5) = " + resultDiv);
