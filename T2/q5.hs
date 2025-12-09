main :: IO()
main = do
  print (ltrim odd myList)
  print (rtrim odd myList)
  print (trim odd myList)

-- remove from front
ltrim :: (a -> Bool) -> [a] -> [a]
ltrim _ [] = []
ltrim p (x:xs)
  | p x       = ltrim p xs
  | otherwise = x:xs

-- remove from end
rtrim :: (a -> Bool) -> [a] -> [a]
rtrim p xs = reverse (ltrim p (reverse xs))

-- remove from both
trim :: (a -> Bool) -> [a] -> [a]
trim p xs = ltrim p (rtrim p xs)

myList :: [Int]
myList = [1, 2, 3]