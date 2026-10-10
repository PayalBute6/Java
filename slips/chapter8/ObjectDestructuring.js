// Question: Create an object containing employee details such as name, department, and salary. Use object destructuring to extract and display the values

// 1. Create the employee object
const employee = {
    name: "Pavan",
    department: "Software Engineering",
    salary: 85000
};

/* 
   2. Use Object Destructuring to extract the values.
   Instead of constantly writing employee.name, employee.department, etc., 
   we can extract them all at once into their own variables!
*/
const { name, department, salary } = employee;

// 3. Display the extracted values
console.log("--- Employee Details ---");
console.log("Name: " + name);
console.log("Department: " + department);
console.log("Salary: $" + salary);
