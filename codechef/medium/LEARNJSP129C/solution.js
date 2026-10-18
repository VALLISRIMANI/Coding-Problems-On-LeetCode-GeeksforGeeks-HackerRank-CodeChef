// Submit the code and observe the flow

// Main function with an arrow function as a callback
function doSomething(callback) {
  console.log('Doing something...');
  
  // Calling back the arrow function
  callback();
}

// Using the main function with an arrow function as a callback
doSomething(() => {
  console.log('Callback function called!');
});