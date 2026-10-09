// Question: Write a JavaScript program to swap two numbers without using a third variable using array destructuring

// 1. Initialize two variables
let a = 10;
let b = 25;

console.log("Before swapping:");
console.log("a = " + a + ", b = " + b);
console.log("------------------");

/* 
   2. Swap the numbers using Array Destructuring 
   The syntax [a, b] = [b, a] instantly swaps the values 
   without needing a temporary third variable.
*/
[a, b] = [b, a];

// 3. Display the final swapped results
console.log("After swapping:");
console.log("a = " + a + ", b = " + b);
