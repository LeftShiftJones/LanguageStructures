import Data.List
import Data.String

-- helper functions
intsqrt :: Int -> Int
intsqrt x = ceiling (sqrt (fromIntegral x))

-- prime decomp logic
primes :: Int -> Int -> [Int]
primes begin end = [x | x <- [begin..end], is_prime x]

is_prime :: Int -> Bool
is_prime x = if x == 2 || x == 3 then True
    else if null (takeWhile (<x) [n | n <- [2..(intsqrt x)], x `mod` n == 0]) then True
    else False

prime_partitions :: Int -> [Int] -> [Int] -> [[Int]] -> [[Int]]
prime_partitions n primes lst sols =
    if sum lst == n then lst:sols
    else if null primes then [[]]
    else [x | x <- (sols ++ 
                   (prime_partitions n (tail primes) ((head primes):lst) sols) ++
                   (prime_partitions n (tail primes) lst sols)),
                   not (null x)]

print_partitions :: [[Int]] -> IO ()
print_partitions sols = do {
    (
        putStrLn (intercalate " + " [ show x | x <- (reverse (head sols))] )
    );
    (
        if not (null (tail sols)) then print_partitions (tail sols) else putStr ""
    );
}

run :: Int -> IO ()
run n = print_partitions ( prime_partitions n (primes 2 n) [] [[]] )