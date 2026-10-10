// Question: Write a JavaScript program using a rest parameter to accept any number of values and calculate their sum

/* 
   1. Define a function with a Rest Parameter (...numbers)
   The '...' in the function definition groups however many arguments 
   you pass into a single array named 'numbers'.
*/
function calculateSum(...numbers) {
    let total = 0;
    
    // 2. Loop through the 'numbers' array to add them all up
    for (let i = 0; i < numbers.length; i++) {
        total += numbers[i];
    }
    
    return total;
}

// 3. Test the function by passing completely different amounts of numbers!
const sum1 = calculateSum(10, 20);
const sum2 = calculateSum(5, 10, 15, 20, 25);
const sum3 = calculateSum(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

// Display the results
console.log("Sum of (10, 20) is: " + sum1);
console.log("Sum of (5, 10, 15, 20, 25) is: " + sum2);
console.log("Sum of 1 through 10 is: " + sum3);
