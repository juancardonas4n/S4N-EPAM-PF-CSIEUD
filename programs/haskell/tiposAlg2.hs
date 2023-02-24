---

data Lista a = Vacia
             | Cons a (Lista a)
             deriving (Show, Eq)

lst1 = Cons 1 (Cons 2 (Cons 3 Vacia))
lst2 = Cons 4 (Cons 9 (Cons 10 Vacia))

suma :: (Num a) => Lista a -> a
suma Vacia = 0
suma (Cons x xs) = x + suma xs

prod :: (Num a) => Lista a -> a
prod Vacia = 1
prod (Cons x xs) = x * prod xs

plegar :: (a -> b -> b) -> b -> Lista a -> b
plegar f e Vacia = e
plegar f e (Cons x xs) = f x (plegar f e xs)
