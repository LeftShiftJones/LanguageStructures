function is_prime(n) {
    if (n <= 1) { return false; }
    for (let i = 2; i < Math.floor(Math.sqrt(n))+1; i++) {
        if (n % i == 0) { return false; }
    }
    return true;
}

function primes(a, b) {
    prime_list = [];
    for(let i = a; i < (b + 1); i++) {
        if(is_prime(i)) { prime_list.push(i); }
    }
    return prime_list;
}

function prime_partitions(n, k = 1, lst = []) {
    if(n==0) {
        print_primes(lst)
    } else if(n > k) {
        primes(k + 1, n).forEach((i)=> {
            prime_partitions(n - i, i, lst.concat(i));
        })
    }
}

function print_primes(lst) {
    let str = ""
    for (let i = 0; i < lst.length - 1; i++) {
        str += lst[i] + " + ";
    }
    str += lst[lst.length-1];
    console.log(str)
}

//Runs the Program
const readline = require('readline')
var rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout,
});

function ask_user() {
    rl.question("Enter a number (non-number to quit): ", (answer) => {
        answer = parseInt(answer)
        if(isNaN(answer)) {
            console.log(`\n\nBye!`);
            process.exit();
        } else {
            prime_partitions(answer);
            ask_user();
        }
    });
}

ask_user();
