// Click on submit to see the result

// Global variable
var x = 10;

function myFunction(){
    // Local variable with the same name as the global variable
    var x = 20;
    
    // Accesses the local variable
    console.log(x);
}

myFunction();
// Output: 20

console.log(x);
// Output: 10 (global variable is not affected)