p1 :: Int
p1 = [a*b*c | c <- [334..499], b <- [1..c], a <- [1..b], c^2 == a^2+b^2, a+b+c == 1000]
