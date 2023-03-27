# 

# Programación Funcional

1. Definición formal de programación funcional
2. Funciones puras
3. Tipos de datos algebraicos
4. Funciones de alto orden
4. Evaluación perezosa
6. Efectos colaterales
7. Listas y demostraciones
8. Entrada y salida de un mundo imperativo en un mundo declarativo
9. Cierre

---

# 1. Definición forma de la programación funcional

> "La programación funcional es el acto de escribir programas con funciones
>  puras" (Turtle Z. 2020)


> "La programación funcional (PF) está basada en un simple premisa: construimos
>  programas que no tiene efectos colaterales"
>  (Chiusano P., Bjarnason, Rúnar. 2015)

---

# 2. Funciones puras

Las funciones puras tienes tres propiedades (Turtle, Z. 2020):

* Totales
* Deterministas
* Inculpables

---

# 2. Funciones puras (2)

¿Qué es la transparencia referencial?

> "Una función debe ser reemplazable por los valores que esta
> recibe e insertando el resultado generado" (Hunt, J. 2014)

---

# 3. Tipos de datos algebraicos

* Operaciones de suma
* Operaciones de producto
* Clases
* Una combinación de ambos

---

# 4. Funciones de alto orden

* Las funciones son ciudadanos de primer orden:
  * Se puede retornar una función
  * Se puede recibir una función

---

# 4. Funciones de alto orden (Listas)

* Listas: `[a]`, `[]`, `:`
* `foldr :: (a -> b -> b) -> b -> [a] -> b`
* `foldl :: (b -> a -> b) -> b -> [a] -> b`
* `foldr :: (Foldable t) => (a -> b -> b) -> b -> t a -> b`
* `foldl :: (Foldable t) => (b -> a -> b) -> b -> t a -> b`
* `map :: (a -> b) -> [a] -> [b]`

---

# 5. Evaluación perezosa

* La una expresión solo es evaluada cuando se requiere.

---

# 6. Efectos colaterales

* Asignación de variables
* Ciclos
* Entrada y salida
* Excepciones

---

# 7. Programación imperativa y la programación funcional

* La programación funcional (pura) evita los efectos colaterales.
* La programación imperativa hace uso de los efectos colaterales.
* ¿Qué hacer?
  - Estado de IO en programación funcional (Hudak, P. 1989)
    * Flujos (Streams)
    * Continuaciones
    * Sistemas (Systems)
  - Solución
    * Mónadas (Moggi, E, 1989)

---

# 8. Entrada y salida de un mundo imperativo en un mundo declarativo (Definición)

* Mónadas:
  - Contenedor: `return :: a -> IO a`
  - Computación:
      * bind: `(>>=) :: IO a -> (a -> IO b) -> IO b`
    * then: `(>>)  :: IO a -> IO b -> IO b`

---

# 8. Entrada y salida de un mundo imperativo en un mundo declarativo (Otra definición de Mondor)

* Mónada. (Peyton Jones, S. 2010)

```haskell
type IO a = Word -> (a, World)
```

* funciones:

```haskell
getChar :: IO Char
putChar :: Char -> IO ()
```

---

# 8. Entrada y salida de un mundo imperativo en un mundo declarativo (Otras mónadas)

* `Identity`
* `Maybe`
* `Error`
* `List`
* `IO`
* `State`
* `Reader`
* `Writer`
* `Continuation`

---

# 9. Cierre

* Es posible hacer programación imperativa a través de **mónadas**
* Estrategia: dividir los dos mundos
* Permite tener una mayor versátilidad del operador (`;`):
  + Bind: `(>>=)`
  + Then: `>>`

---

# Bibliografía

* Bird, R. Using circular programs to eliminate multiple traversals of data. Act Info. 1984.
* Bird, R. Introducción a la programación funcional. Prentice-Hall. 2000.
* Chiusano, P., Bjarnason, R. Functional Programming in Scala. Manning Publications. 2015.
* Hudak, P. On the Expressivenss of Purely Functional I/O Systems. 1989.
* Moggi, E. Computational lambda calculus and monads. 1989.
* Peyton Jones, S. Tackling the Awkward Squad: monadic input/ouput, concurrency, exceptions, and foreing-languages calls in Haskell. 2010.
* Turtle, Z. Functional Programming for Mortals with Cats. Lean Publishing. 2020.
* Viera, M. Swierstra, S.D. Attribute Grammars Fly First-Class How to do Aspect Oriented Programming in Haskell. 2009
