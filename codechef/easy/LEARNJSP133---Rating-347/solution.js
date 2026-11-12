// Debug the code below to solve the problem

function multiply(a, b) {
    return (a * b);
}

function sum(x, y) {
    return (x + y);
}
    
function absDiff(a, b) {
    return Math.abs(a - b); // Math.abs() is inbuilt JS method
}

function solve(A, B){
    const muliplication = multiply(A, B);
    const summation = sum(A, B);
    const result = absDiff(muliplication, summation);
    console.log(result);
}