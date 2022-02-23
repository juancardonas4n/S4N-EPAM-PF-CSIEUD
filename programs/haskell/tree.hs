--

data Tree = Tree_Leaf Int
          | Tree_Bin Tree Tree
          deriving Show

repmin :: Tree -> Tree
repmin t = undefined

tr = Tree_Bin (Tree_Leaf 3) (Tree_Bin (Tree_Leaf 4) (Tree_Leaf 5))
