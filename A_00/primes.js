var base_cases = [2, 3]
var list_of_solutions = []

function is_prime(n) {
    if(n <= 1) {
        return false
    }
    for(let i=2; i < Math.floor(Math.sqrt(n))+1; i++) {
        if (n % i == 0) {
            return false
        }
    }
    return true
}

/**
 * Function determines if a prime number can be broken down into prime
 * factors without duplicates
 **/
function is_decomposable(n) {
    if(base_cases.includes(n)) {
        return false;
    }
    return (n-5) % 6 !== 0;
}


function find_primes(num) {
    let primes = [];
    for(let i=num-2; i > 1; i--) { // Maybe stop at n/2? || Math.floor(Math.sqrt(n))+1
        if(is_prime(i)) {
            primes.push(i);
        }
    }
    return primes;
}

function get_solutions(num, goal, primes) {
    let start = 0;
    let end = primes.length-1;
    while(1) {
        if(start + 1 == end) { break; } //base case, pointers have reached each other
        if(primes[start] + primes[end] > num) {
            start++;
            end = primes.length-1;
        } else if(primes[start] + primes[end] < num) {
            end--;
        } else { //Our numbers add to n
            // console.log(primes[start] + " " + primes[end])
            let solutionStr = [];
            let solutionEnd = [];
            if(is_decomposable(primes[end])) {
                solutionEnd.push(primes[start]);
                solutionEnd = solutionEnd.concat(get_solutions(primes[end], goal, primes.slice(end)));
                if(sum_is_goal(solutionEnd, num)) {
                    list_of_solutions.push(solutionEnd);
                }
            }
            if(is_decomposable(primes[start])) {
                solutionStr = solutionStr.concat(get_solutions(primes[start], goal, primes.slice(start)));
                solutionStr.push(primes[end]);
                if(sum_is_goal(solutionStr, num)) {
                    list_of_solutions.push(solutionStr);
                }
            }

            if(!is_decomposable(primes[start]) && !is_decomposable(primes[end])) {
                solutionStr.push(primes[start], primes[end]);
            }

            if(primes[start] + primes[end] == goal) {
                list_of_solutions.push([primes[start], primes[end]]);
            } else {
                return solutionStr;
            }
            start++;
            end = primes.length-1;
        }
    }

    return list_of_solutions;
}

function sum_is_goal(list, goal) {
    let sum = 0;
    for(let i of list) {
        sum += i;
    }
    return sum == goal;
}

function add_to_solutions(list) {
    list_of_solutions.push(list)
}
let num = 29
let primes = find_primes(num);
let solutions = get_solutions(num, num, primes);
console.log(solutions);
