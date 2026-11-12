// Solution

function usersWithRating(onlyViewed, attempted, visited){
      return (visited - onlyViewed);
}

function usersWithHighRating(onlyViewed, attempted, visited) {
    return (visited - onlyViewed - attempted);
}

function solve(N, A, B) {
    var result1 = usersWithRating(A, B, N);
    var result2 = usersWithHighRating(A, B, N);
    console.log(result1, result2);
}
