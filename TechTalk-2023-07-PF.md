# Programación funcional en lenguajes no funcionales

* Juan Francisco Cardona McComick

---

# Agenda

1. ¿Qué es la programación funcional?
2. Funciones puras
3. Valores inmutables
4. Aplicar principios funcionales a un programa no funcional
5. Cierre

---

# 1. ¿Qué es la programación funcional?

> "La programación funcional es el acto de escribir programas con funciones
>  puras." (Turtle Z. 2020)

> "La programación funcional (PF) está basada en un simple premisa: construimos
>  programas que no tiene efectos colaterales."
>  (Chiusano P., Bjarnason, Rúnar. 2015)

---

# 1. ¿Qué es la programación funcional? - Conjunto de técnicas

+ Funciones anónimas
+ Funciones de alto orden
+ Clausuras
+ Currificación
+ Evaluación perezosa
+ Polimorfismo parámetrico
+ Tipos de datos algebraicos
+ Aplicativos
+ Mónadas

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

* Solo pueden ser construidos
* No puede ser actualizados
* "Actualizaciones" a través de la creación de nuevos

---

# 3. Tipos de datos inmutables (Tipos algebraicos)

* Operaciones de suma
* Operaciones de producto
* Una combinación de ambos

---

# 4. Aplicar principios funcionales a un programa no funcional (v0.1)

+ Programa no funcional
```java
public class CoffeeStore {
    public static Coffee buyCoffee(CreditCard creditCard) {
        Coffee coffee = new Coffee();
        creditCard.charge(coffee);
        return coffee;
    }
}
```
+ ** ¿Por qué? **

---

# 4. Aplicar principios funcionales a un programa no funcional (v0.2)

+ Separar el pago del producto
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

# 4. Aplicar principios funcionales a un programa no funcional (v0.3)

+ Funciones como un tipo de dato
```java
public interface Function<T, U> {
  U apply(T arg);
}
```
+ Funciones de alto orden


---

# 4. Aplicar principios funcionales a un programa no funcional (v0.4)

+ Funciones lambda

---

# 4. Aplicar principios funcionales a un programa no funcional (v0.5)

+ Hacer únicos los resultados
```
public class<T,U> Tuple {
  // ...
}
```

---

# 4. Aplicar principios funcionales a un programa no funcional (v0.6)

+ Componiendo múltiples pagos en un único pago
```java
public Payment combine(Payment payment) {
// ...
}
```

---

# 4. Aplicar principios funcionales a un programa no funcional (v0.7)

+ Introducir compras múltiples de café
+ El tipo de dato `List` (Inmutable).
+ El tipo `Supplier<A>`

---

# 4. Aplicar principios funcionales a un programa no funcional (v0.7)

```java
public class CoffeeStore {
  // ...
  public static Tuple<List<Coffee>, Payment> buyCoffees(...) {
  // ...
  }
}
```

---

# 4. Aplicar principios funcionales a un programa no funcional (v0.8)

```java
@Test
public void testByCoffees() {
   CreditCard creditCard = new CreditCard();
   Tuple<List<Coffee>, Payment> purchase = CoffeeStore.buyCoffees(5,
                                                                  creditCard);
   assertEquals(Coffee.price * 5, purchase._2.amount);
   assertEquals(creditCard, purchase._2.creditCard);
}
```


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

* Bird, R. Introducción a la programación funcional. Prentice-Hall.
         2000.
* Chiusano, P., Bjarnason, R. Functional Programming in Scala.
         Manning Publications. 2015.
* Cukic. Ivan. Functional Programming in C++. How to improve your C++
         programs using functional techniques. Manning Publications. 2019.
* Saumont, P-Y., Functional Programming in Java. Manning Publications. 2017.
* Turtle, Z. Functional Programming for Mortals with Cats. Lean Publishing. 2020.
