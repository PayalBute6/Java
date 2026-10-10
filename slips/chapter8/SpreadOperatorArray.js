// Question: Write a JavaScript program to create a copy of an existing array using the spread operator and add a new element to the copied array.

// 1. Create our original array
const originalArray = ["Apple", "Banana", "Cherry"];

/* 
   2. Use the Spread Operator (...) to make a copy.
   The '...originalArray' takes all items from the first array and spreads 
   them into this new array. We also add a new element ("Date") at the end!
*/
const copiedArray = [...originalArray, "Date"];

// 3. Display the results to prove they are different
console.log("Original Array:");
console.log(originalArray);

console.log("\nCopied Array (with new element added):");
console.log(copiedArray);
