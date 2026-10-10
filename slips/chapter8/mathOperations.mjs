// Question: Create a JavaScript module containing arithmetic operation functions. 
// Export the function and import it into another JavaScript file to perform all operations.

// 1. Define the arithmetic functions
function add(a, b) {
    return a + b;
}

function subtract(a, b) {
    return a - b;
}

function multiply(a, b) {
    return a * b;
}

function divide(a, b) {
    return a / b;
}

// 2. Export them so other files can import and use them!
// (We use .mjs file extension to tell Node.js we are using modern ES6 Modules)
export { add, subtract, multiply, divide };
