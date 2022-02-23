-- 

factorial :: Integer -> Integer
factorial n = fac' 1 n
  where fac' a 0 = a
        fac' a n = fac' (a * n) (n - 1)
