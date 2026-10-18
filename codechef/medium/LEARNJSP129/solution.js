function greet(name){
    return "Hello, " +  name + "!";
}
function capitalize(text){
  // toUpperCase() is an inbuilt JS method that converts a string to uppercase letters
    return text.toUpperCase();
}


function greetAndCapitalize(name){
   // complete the function code 
   return greet(capitalize(name));
}

// Call the functions
var name = "Alice";
var finalResult = greetAndCapitalize(name);

// Display the results
console.log("Final Result:", finalResult);