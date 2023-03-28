# Programación funcional en lenguajes no funcionales

* Juan Francisco Cardona McComick

---

# Agenda

1. ¿Qué es la programación funcional?
2. Funciones puras
3. Valores inmutables
4. Aplicar principios funcionales a un ejemplo
5. Cierre

---

# 1. ¿Qué es la programación funcional?

> "La programación funcional es un estilo de programación que enfatiza la *evaluación
>  de expresiones*, en vez de la *ejecución de comandos*. Las expresiones en estos lenguajes
>  son formados por el uso de funcines que combinan valores básicos. Un
>  lenguaje funcional es un lenguaje que soporta y fomenta programación en
>  un estilo funcional."  (FAQ para `comp.lang.functional`)

> "La programación funcional es el acto de escribir programas con funciones
>  puras." (Turtle Z. 2020)

> "La programación funcional (PF) está basada en un simple premisa: construimos
>  programas que no tiene efectos colaterales."
>  (Chiusano P., Bjarnason, Rúnar. 2015)


---

# 1. ¿Qué es la programación funcional? - Conjunto de técnicas

+ Funciones de primera clase
+ Funciones anónimas
+ Clausuras
+ Currificación
+ Evaluación perezosa
+ Polimorfismo parámetrico
+ Tipos de datos algebraicos

---

# 1. ¿Qué es la programación funcional? - Efectos coláterales (1)

> "La programación funcional es acerca de escribir programas que no tengan
> ningún otro resultado observable además del valor retornado." (Saumont P., 2017)

> "La programación funcional no tiene efectos colaterales." (Saumont P., 2017)

---

# 1. ¿Qué es la programación funcional? - Efectos coláterales (2)

+ No variables mutables
+ No imprimir en la consola o algún dispositivo de Entrada-Salida
+ No escribir a ficheros, bases de datos, redes, o similares
+ No lanzar excepciones

---

# 1. ¿Qué es la programación funcional? - Beneficios

+ Los programas funcionales son más fáciles de razonar debido a que son
  deterministas
+ Los programas funcionales son más fáciles de probar
+ Los programas funcionales son más módulares debido a qué son
  construidos de funciones puras
+ Los programas funcionales hacen la composición y recombinación
  mucho más fácil
+ Los programas funcionales son inherentemente seguros en los hilos
  (*Thread-safe*) debido a que ellos evitan un estado compartido

---

# 2. Funciones puras

Las funciones puras tienes tres propiedades (Turtle, Z. 2020):

* Totales
* Deterministas
* Inculpables

---

# 2. Funciones puras (2) - Transparencia referencial

¿Qué es la transparencia referencial?

> "Una función debe ser reemplazable por los valores que esta
> recibe e insertando el resultado generado" (Hunt, J. 2014)

---

# 2. Funciones puras (3) - Transparencia referencial

+ Es auto-contenido. Este no depende de cualquier dispositivo externo
+ Este es deterministico
+ Nunca lanza cualquier clase de excepción
+ No se "cuelga" debido a dispositivos externos

---

# 3. Tipos de datos inmutables



---

# 3. Tipos de datos inmutables (Tipos algebraicos)

* Operaciones de suma
* Operaciones de producto
* Clases
* Una combinación de ambos

---

# 4. Aplicar principios funcionales a un programa no funcional (1)

+ Programa no funcional
```java
public class CoffeeMarker {
    public static Coffee buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        creditCard.charge(coffee);
        return coffee;
    }
}
```
+ Tiene efectos colaterales

---

# 4. Aplicar principios funcionales a un programa no funcional (2)

+ Separar el pago (`Payment`)
```java
public class Payment {
  // ...
}
```
+ Devolver un único resultado (`Purchase`)
```java
public class Purchase {
  // ...
}
```

---

# 4. Aplicar principios funcionales a un programa no funcional (3)

+ Generalidad (`Tuple`)
```
public class<T,U> Tuple {
  // ...
}
```

---

# 4. Aplicar principios funcionales a un programa no funcional (4)

+ Componiendo múltiples pagos en un único pago
```java
public Payment combine(Payment payment) {
// ...
}
```

---

# 4. Aplicar principios funcionales a un programa no funcional (5)

+ Introducir múltiples pagos
```java
public class CoffeeMarker {
  // ...
  public static Tuple<List<Donut>, Payment> buyCoffee(...) {
  // ...
  }
}
```

---

# 4. Aplicar principios funcionales a un programa no funcional (5)



---

# 5. Cierre

* Programación funcional es programar:
  + con funciones,
  + retornar valores,
  + no tener efectos colaterales.
* Los programas funciones son:
  + fáciles de razonar
  + fáciles de probar
* Programación funcional ofrece:
  + alto nivel de abstracción,
  + alto nivel de reutilización
* Programación funcional es más robusto que la programación imperativa
* Programación funcional es más seguro en entorno multihilos

---

# Bibliografía

* Bird, R. Using circular programs to eliminate multiple traversals
          of data. Act Info. 1984.
* Bird, R. Introducción a la programación funcional. Prentice-Hall.
         2000.
* Chiusano, P., Bjarnason, R. Functional Programming in Scala.
         Manning Publications. 2015.
* Cukic. Ivan. Functional Programming in C++. How to improve your C++
         programs using functional techniques. Manning Publications. 2019.
* Hudak, P. On the Expressivenss of Purely Functional I/O Systems. 1989.
* Moggi, E. Computational lambda calculus and monads. 1989.
* Peyton Jones, S. Tackling the Awkward Squad: monadic input/ouput,
         concurrency, exceptions, and foreing-languages calls in Haskell. 2010.
* Saumont, P-Y., Functional Programming in Java. Manning Publications. 2017.
* Turtle, Z. Functional Programming for Mortals with Cats. Lean Publishing. 2020.
* Viera, M. Swierstra, S.D. Attribute Grammars Fly First-Class How to do Aspect
         Oriented Programming in Haskell. 2009
