
echo :: IO ()
echo = do
  c <- getChar
  putChar c

echoTwice :: IO ()
echoTwice = do
  echo
  echo
  

echoDup :: IO ()
echoDup = do
   c <- getChar
   putChar c
   putChar c

-- getTwoChars :: IO (Char,Char)
-- getTwoChar = getChar >>= \c1 ->
--              getChar >>= \c2 -> putChar (c1,c2)
