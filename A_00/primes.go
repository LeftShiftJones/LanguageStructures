package main

import "fmt"
import "math"

func main() {
    fmt.Println("Hello, World!")

    fmt.Println(is_prime(20))

    fmt.Println(is_prime(17))
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
