### Ejercicio Nº 1 - Estructuras Condicionales - Individual

- a) Una recital permite únicamente el ingreso de mayores de 18 años. Para ello necesita un programa que, a partir de que un usuario ingrese su edad, determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.
    

#### Resolución

a. 
```java
Scanner teclado= new Scanner(System.in);

        System.out.print("Ingresa tu edad: ");
        int edad = teclado.nextInt();

        if (edad >= 18) {
            System.out.println("Puede ingresar");
        } else {
            System.out.println("No puede ingresar");
        }
```


**[Descargar Resolución](./resources/2_1-ResolucionMayorDeEdad.zip)**

---

### Ejercicio Nº 2 - Estructuras Repetitivas - Individual

a. Imagina que eres un cajero en un supermercado. Crea un programa en Java que permita ingresar el precio de varios productos comprados por un cliente. Utiliza una estructura repetitiva (la que quieras) para continuar pidiendo precios hasta que el usuario decida finalizar. Luego, muestra el total de la compra que debe abonar.
    

**Pista:** _Recuerda que existen dos tipos de bucles, los controlador por un contador (cuando sabemos un número exacto de productos por ejemplo) u por centinela (cuando no sabemos cuántos productos va a comprar el cliente). En este caso debes aplicar un “centinela”. Un ejemplo podría ser, si se ingresa un número negativo o un 0 como monto de un producto._

#### Resolución

**[Descargar Resolución](./resources/2_2-CajeroSupermercado.zip)**

---

### Ejercicio Nº 3 - Arreglos: Vectores - Individual

Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas de la última semana, calcule la temperatura máxima promedio que hubo.

Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente temperatura máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.

#### Resolución

**[Descargar Resolución](./resources/2_3-WebMeteorologia.zip)**

---

### Ejercicio Nº 4 - Matrices

Imagina que estás trabajando en un sistema de reservas de asientos para un teatro. Crea un programa en Java que represente un mapa de asientos en una matriz de 5x5 y ten en cuenta lo siguiente:

- Los asientos pueden estar ocupados (representados por "X") o vacíos (representados por "O").
    
- Permite al usuario ingresar por teclado donde quiere sentarse, indicando su fila y número de asiento (por ejemplo, "Fila 3, Asiento 2"). El programa debe marcar como ocupado ese asiento solo en caso de que esté vacío.
    
- Si el asiento elegido por el usuario está ocupado, el sistema debe informar que elija otro diferente.
    
- A medida que los asientos se ocupen, el programa debe actualizar el mapa de asientos y mostrarlo por pantalla luego de cada reserva.
    
- Intenta hacer pruebas con otros compañeros, imagina que ellos son los compradores y tú el encargado del teatro. ¿Funciona para todos los casos? ¿Encontraste errores que resolver? ¿Considera tu programa los asientos ya reservados?
    
- El sistema deberá seguir corriendo hasta que el encargado de cargar las reservas de los asientos determine que ha finalizado. **Pista:** Puedes preguntar en cada “vuelta” del bucle, si esta ha sido la última compra.
    

#### Resolución

**[Descargar Resolución](./resources/2_4-SistemaTeatro.zip)**

**[Descargar otra Resolución de Master Class](./resources/2_4-ResolAnfiteatro.zip)**
  

**Video Resolución**

[![](./resources/prueba-tecnica-screenshot.png)](https://youtu.be/npfzSC8B3aM)

