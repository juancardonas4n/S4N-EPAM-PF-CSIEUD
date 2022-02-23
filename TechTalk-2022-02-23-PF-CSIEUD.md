# Programación funcional: cómo ser imperativo en un mundo declarativo

1. Definición formal de programación funcional
2. Funciones puras
3. Tipos de datos algebraicos
4. Funciones de alto orden
4. Evaluación perezosa
6. Efectos colaterales
7. Programación imperativa y la programación funcional. 
8. Entrada y salida en la programación funcional
9 . Concurrencia en la programación funcional

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

# 5. Evaluación perezosa

**Problema repmin**

> "La función clásica de *repmin* propuesta por Ricard S. Bird, donde ésta toma un árbol como argumento, y
> retorna un árbol de forma similar, en la cual los valores son reemplazados
> por el valor mínimo de las hojas del árbol original." (Viera, M. Swierstra, S.D., 2009)

---

# 6. Efectos colaterales

* Asignación de variables
* Ciclos
* Entrada y salida
* Excepciones

---

# 7. Programación imperativa y la programación funcional

* La programación funcional evita los efectos coláterales.
* La programación imperativa puede vivir con los efectos coláterales.
* ¿Qué hacer?
<!-- Buscar referencia -->
  - Buscar diferentes modos de entrada y salida
    * Transferencia de estados.
    * Flujos
    * Mónadas
---

# 8. Entrada y salida en programación funcional

<!-- Por escribir -->
* Monada: `IO a`

---

# 9. Concurrencia en programación funcional

<!-- Por escribir -->

# Bibliografía

* Bird, R. Using circular programs to eliminate multiple traversals of data. Act Info. 1984.
* Chiusano, P., Bjarnason, R. Functional Programming in Scala. Manning Publications. 2015.
* Turtle, Z. Functional Programming for Mortals with Cats. Lean Publishing. 2020.
* Viera, M. Swierstra, S.D. Attribute Grammars Fly First-Class How to do Aspect Oriented Programming in Haskell. 2009
