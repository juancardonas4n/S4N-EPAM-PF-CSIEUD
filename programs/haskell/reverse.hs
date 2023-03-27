module Main where

putLine :: String -> IO ()
putLine []     = putChar '\n'
putLine (c:cs) = do
  putChar c
  putLine cs

main :: IO ()
main = do
  l <- getLine
  putLine (reverse l)
