package main

import (
    "fmt"
    "math"
    "strings"
    "strconv"
)

func main() {
    fmt.Printf("Enter a number (non-number to quit): ")

    var num int
    // read in user input
    num_read, err := fmt.Scanf("%d", &num)

    // fmt.Printf("num read: %d", num_read)

    if(num_read < 1 && err != nil) {
        fmt.Println("\n\nBye!")
        
    } else {
        var lst = []int{}
        prime_partitions(num, 1, lst)
    }

}


/**
 * Function determines if a number is a prime
 **/
func is_prime(n int) (bool) {
    if n <= 1 {
        return false
    }
    for i:=2; i <  int(math.Sqrt(float64(n))) + 1; i++ {
        if n % i == 0 {
            return false
        }
    }
    return true
}

func primes(a int, b int) ([]int) {
    var primes_list = []int{}
    for i:=a; i < b + 1; i++ {
        if(is_prime(i)) {
            primes_list = append(primes_list, i)
        }
    }

    return primes_list
}

func prime_partitions(n int, k int, lst []int) {
    if(n == 0){
        print_primes(lst)
    } else if(n > k) {
        for _, p := range primes(k + 1, n) {
            // fmt.Printf("%d", i)
            prime_partitions(n - p, p, append(lst, p))
        }
    }
}

func print_primes(lst []int) {
    print_list := []string{}
    for i:=0; i < len(lst); i++ {
        val := strconv.Itoa(lst[i])
        print_list = append(print_list, val)
    }
    fmt.Println(strings.Join(print_list, " + "))
}
