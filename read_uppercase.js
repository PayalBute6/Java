const fs = require('fs');

try {
    // Read the file synchronously
    const data = fs.readFileSync('abc.txt', 'utf8');
    
    // Convert to uppercase and print
    console.log("--- Contents in UPPERCASE ---");
    console.log(data.toUpperCase());
} catch (err) {
    console.error("Error: Could not read abc.txt. Make sure the file exists.");
}
