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

prime_partitions :: [Int] -> Int -> Int -> Int -> ()
prime_partitions lst lo hi total = 
    do { 
    (
        
    );
    (
        if sum lst == total then print (intercalate " + " lst)
        else if (sum lst) + lo
    );
    }