-- a. ltrim: removes all items from the start of the list that satisfy the predicate function.
ltrim :: (a -> Bool) -> [a] -> [a]
ltrim _ [] = []
ltrim p (x:xs)
  | p x       = ltrim p xs
  | otherwise = x:xs

-- b. rtrim: removes all items from the end of the list that satisfy the predicate function.
rtrim :: (a -> Bool) -> [a] -> [a]
rtrim p xs = reverse (ltrim p (reverse xs))

-- c. trim: removes all items from both the start and end of the list that satisfy the predicate function.
trim :: (a -> Bool) -> [a] -> [a]
trim p xs = ltrim p (rtrim p xs)