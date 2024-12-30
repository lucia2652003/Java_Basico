### Ejercicio Nº 1 - Sintaxis básica - Individual

**a)** Escribir un programa en **Java** que muestre por pantalla un mensaje de Bienvenida a un usuario. Por ejemplo: “Hola, bienvenido al sistema”.  

**b)** Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable y se muestre el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenido al sistema”.

#### Resolución

a. 
```java
System.out.println(“Hola, bienvenido al sistema”);
```

b. 
```java
String nombre = “Eduardo”;
System.out.println(“Hola,” + nombre +  “bienvenido al sistema”);
```

---
### Ejercicio Nº 2 - Tipos de Datos - Grupal

**a)** Crea un programa que declare una variable para cada uno de los siguientes tipos de datos: _int_, _double_, _boolean_ y _String_. Asigna un valor a cada variable y muestra su contenido en la consola.  

**b)** Ahora, asigna valores que no correspondan al tipo de dato. Por ejemplo, un _int_ en un _String_ o un _String_ en un _double_… ¿Qué sucede con el programa? ¿Se produce algún error? ¿En qué situaciones se genera error y en cuáles no? Justificar el por qué de cada caso. Debatir con otros compañeros.  

#### Resolución

a. 
```java
// Declarar variables
int numeroEntero = 42;
double numeroDouble = 3.14;
boolean esVerdadero = true;
String cadena = "Hola, mundo!";

// Mostrar contenido de las variables
System.out.println("Número entero: " + numeroEntero);
System.out.println("Número double: " + numeroDouble);
System.out.println("Booleano: " + esVerdadero);
System.out.println("Cadena: " + cadena);
```

b. 
```java
// Declarar variables
int numeroEntero = 42;
double numeroDouble = 3.14;
boolean esVerdadero = true;
String cadena = "Hola, mundo!";

// Mostrar contenido de las variables
System.out.println("Número entero: " + numeroEntero);
System.out.println("Número double: " + numeroDouble);
System.out.println("Booleano: " + esVerdadero);
System.out.println("Cadena: " + cadena);
```

#### ¿Qué sucede con el programa?

Cuando asignas valores que no corresponden al tipo de dato declarado, el programa generará errores de compilación. Esto significa que el código no compilará correctamente y no se ejecutará. Los errores se producirán en las líneas donde intentas asignar valores incorrectos a las variables.

En Java, debes asignar valores que sean **compatibles con el tipo de dato de la variable** (recuerda que es un lenguaje FUERTEMENTE TIPADO).

Si intentas asignar un valor de tipo incorrecto, el programa no se compilará y generará errores. Esto es parte de la **seguridad y la consistencia** del lenguaje.

---
### Ejercicio Nº 3 - Variables y Operadores - Individual

Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado por pantalla.. Recuerda que la fórmula para calcular esto es: (base * altura) / 2 (base por altura dividido dos).

**Pista:** _Debes declarar variables para la base y la altura del triángulo, asignarles valores y luego calcular el área utilizando la fórmula._

#### Resolución

```java
double base = 5; double altura = 3; double area = (base * altura)/2; System.out.println (“El resultado del área es: ” + area);
```

---

### Ejercicio Nº 4 - Operaciones de Lectura - Grupal

Crea un programa que pida al usuario que ingrese por teclado dos números enteros y realice las siguientes operaciones con ellos: suma, resta, multiplicación y división. Muestra por pantalla/consola los resultados de cada una de las operaciones con un mensaje amigable para el usuario.

- **Sugerencia:** Compara los resultados que obtengas con otros compañeros. Pide a tus compañeros que te digan números al azar y haz las pruebas necesarias para comprobar el funcionamiento de tu programa.

**Extra:** ¿Qué sucede si como segundo número de una división se ingresa 0? Con lo que sabes o aprendiste hasta ahora… ¿De qué manera tratarías de evitar ésta situación?


#### Resolución

```java
// Crear un objeto Scanner para la entrada del usuario
Scanner scanner = new Scanner(System.in);

// Pedir al usuario que ingrese dos números enteros
System.out.println("Ingresa el primer número entero: ");
int num1 = scanner.nextInt();

System.out.println("Ingresa el segundo número entero: ");
int num2 = scanner.nextInt();

// Realizar operaciones aritméticas
int suma = num1 + num2;
int resta = num1 - num2;
int multi = num1 * num2;
double divi = num1 / num2;

// Mostrar los resultados con mensajes personalizados
System.out.println("Resultado de la suma: " + suma);
System.out.println("Resultado de la resta: " + resta);
System.out.println("Resultado de la multiplicación: " + multi);
System.out.println("Resultado de la división: " + divi);
```


## Resoluciones

> 📌 Recuerda que las resoluciones estarán habilitadas el último día de la semana luego de la revisión en la clase en vivo.

> 📌 Asegúrate de haber resuelto y subido tus resoluciones propias a tu repositorio antes de que se habiliten las resoluciones semanales.

