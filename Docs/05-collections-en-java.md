## Collections en Java - Temas a tratar

En esta clase se abordarán las siguientes temáticas:

- Collections:
    - List
    - LinkedList
    - ArrayList
    - Map
- Interfaces
- Clases Abstractas

---

## Collections

En Java, las "collections" (colecciones) se refieren a estructuras de datos que se utilizan para almacenar y organizar grupos de objetos. Estas estructuras de datos son fundamentales en la programación y son proporcionadas por la biblioteca estándar de Java en forma de clases e interfaces (concepto que veremos luego). Las "_collections_" permiten el almacenamiento, la manipulación y la gestión eficiente de datos, como listas de elementos, conjuntos, mapas y más.


### List

List es una interfaz en Java que se utiliza para almacenar una colección de objetos en un orden específico. Representa (como lo dice su nombre) una LISTA de objetos. Dependiente de cómo se organizan sus elementos, una lista puede ser de distintos tipos. Por ejemplo: LinkedList o ArrayList.


### LinkedList

LinkedList es una clase que implementa la interfaz principal List. Almacena elementos en una estructura de lista doblemente enlazada, es decir, una lista de objetos que se puede recorrer de diferente manera u orden. Es muy eficiente para inserciones o eliminaciones en cualquier parte de la lista, pero no tan eficiente para el acceso mediante índices. Su principal uso es en proyectos donde se realizan muchas inserciones o eliminaciones.

![](./resources/generic-linkedlist-java.jpg)

**Ejemplo de código**

```java
import java.util.LinkedList;

public class EjemploLinkedList {
    public static void main(String[] args) {
        // Crear una LinkedList de tipo String
        // Puede ser de una clase en particular también
        LinkedList<String> miLinkedList = new LinkedList<>();

        // Agregar elementos al final de la lista
        miLinkedList.add("Manzana");
        miLinkedList.add("Banana");
        miLinkedList.add("Cereza");

        // Agregar un elemento en una posición específica
        miLinkedList.add(1, "Uva");

        // Acceder a elementos por índice
        String fruta = miLinkedList.get(0); // Obtendrá "Manzana"

        // Eliminar un elemento por índice
        miLinkedList.remove(2); // Eliminará "Banana"

        // Tamaño de la LinkedList
        int tamaño = miLinkedList.size(); // Devolverá 3

        // Iterar sobre la LinkedList
        for (String elemento : miLinkedList) {
            System.out.println(elemento);
        }
    }
}
```


### ArrayList

Los **ArrayLists** en Java son una estructura de datos que se utiliza para almacenar una colección de elementos. Son flexibles y dinámicos, lo que significa que puedes agregar o eliminar elementos de manera eficiente sin tener que preocuparte por el tamaño inicial de la lista.

ArrayList utiliza un arreglo (array) para almacenar sus elementos. Esto significa que tiene un tamaño fijo inicial y, cuando se llena, se redimensiona automáticamente para acomodar más elementos. El acceso a elementos por índice es rápido y constante, lo que lo hace eficiente cuando necesitas recuperar elementos rápidamente. Sin embargo, las operaciones de inserción o eliminación en el medio de la lista pueden ser costosas, ya que podrían requerir desplazar elementos en el arreglo.

![](./resources/arraylist-diagram.png)


#### Ejemplos de Código de ArrayList

**Declaración y creación de un ArrayList**

```java
import java.util.ArrayList;

ArrayList<String> miLista = new ArrayList<String>();
```

**Agregar Elementos**

```java
miLista.add("Manzana");
miLista.add("Banana");
miLista.add("Cereza");
```

**Acceder a elementos**

```java
String fruta = miLista.get(0);  // Obtendrá "Manzana"
```

**Eliminar elementos**

```java
miLista.remove(1);  // Eliminará el elemento en el índice 1 (en este caso, "Banana")
```

**Tamaño de un ArrayList**

```java
int tamaño = miLista.size();  // Devolverá 2 después de eliminar "Banana"
```

**Iterar sobre un ArrayList**

```java
for (int i = 0; i < miLista.size(); i++) {
    System.out.println(miLista.get(i));
}
```


### Map

Un Map es una estructura de datos que se utiliza para almacenar pares clave-valor. En otras palabras, relaciona un valor (el valor) con una etiqueta única (la clave). Esto es útil cuando necesitas asociar datos relacionados. Imagina que tienes un diccionario en el que buscas una palabra (la clave) para obtener su definición (el valor). En Java, un Map funciona de manera similar. Puedes buscar un valor específico proporcionando la clave correspondiente.

Algunas características clave de los Map en Java son:

- No permite claves duplicadas: Cada clave en un Map debe ser única, lo que significa que no puedes tener dos claves iguales con valores diferentes.
    
- Eficiencia en la búsqueda: Los Map están diseñados para permitir una búsqueda rápida de valores asociados con una clave. Esto se logra mediante una estructura de datos optimizada, como un árbol o una tabla hash.
    
- Implementaciones diferentes: En Java, hay varias implementaciones de la interfaz Map, como HashMap, TreeMap y LinkedHashMap, que ofrecen diferentes comportamientos y características.
    
- Utilidad para el almacenamiento de configuraciones y asociaciones: Los Map son útiles para almacenar configuraciones de aplicaciones, datos relacionados y asociaciones clave-valor en general.

**Ejemplo de Código:**

```java
import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        // Crear un Map que relaciona nombres con edades
        Map<String, Integer> edades = new HashMap<>();

        // Agregar valores al Map
        edades.put("Juan", 25);
        edades.put("María", 30);
        edades.put("Pedro", 22);

        // Obtener el valor asociado a una clave
        int edadJuan = edades.get("Juan"); // Devolverá 25

        // Verificar si una clave existe en el Map
        boolean existeAna = edades.containsKey("Ana"); // Devolverá false
    }
}
```

---

## Clases Abstractas e Interfaces

### Clases Abstractas

Una clase abstracta es una clase especial en Java que tiene la principal característica de que no puede ser instanciada directamente. Esto quiere decir, que no se pueden crear objetos a partir de ella. Se utiliza como una plantilla o modelo para crear otras clases derivadas. Las clases abstractas pueden contener métodos abstractos (sin cuerpo/implementación) y métodos concretos (con implementación de código).

Entre las principales características de las clases abstractas tenemos:

- **Palabra clave abstract:** Se deben declarar como abstractas usando la palabra clave abstract antes de la palabra clave class.
    
- **Métodos abstractos:** Puede tener tanto métodos abstractos como métodos implementados. Sin embargo, una clase abstracta debe tener de forma OBLIGATORIA al menos un método abstracto.
    
- **Herencia:** Las clases concretas pueden extender (heredar) de una clase abstracta. Esto significa que las clases hijas deben proporcionar implementaciones de forma OBLIGATORIA para todos los métodos abstractos de la clase base abstracta mediante sobreescritura de métodos.

**Ejemplo de Código: Clase Abstracta Vehículo**

```java
public abstract class Vehiculo {
    String marca;
    
    public Vehiculo(String marca) {
        this.marca = marca;
    }

//métodos abstractos (sin implementación)
    public abstract void arrancar();
    public abstract void detener();

//método implementado
    public void limpiarParabrisas() {
      System.out.println("Limpiando parabrisas");
    }
}
```

**Extensión Auto**

```java
public class Auto extends Vehiculo {

private String placa;
private String modelo;
    
    // Constructor que llama al constructor de la clase madre/padre
    public Auto(String marca) {
        super(marca);
    }

    // Implementación del método 'arrancar'
    @Override
    public void arrancar() {
        System.out.println("El auto" + marca + " está arrancando.");
    }

    // Implementación del método 'detener'
    @Override
    public void detener() {
        System.out.println("El auto " + marca + " se está deteniendo.");
    }

    //como el método limpiar parabrisas ya está implementado, no es necesario especificarlo acá sino que se accede simplemente a el mediante la "herencia"
}
```


[![](./resources/clases-abstractas-screenshot.png)](https://youtu.be/I4o7fvSQvBA)

### Interfaces

Una interfaz es un "tipo especial de clase" que se caracteriza por no poder presentar atributos (de forma normal) y que SÓLO puede poseer métodos abstractos, es decir, planteo de métodos sin su correspondiente implementación. Las interfaces permiten "simular" un concepto que no es posible en Java de forma nativa, que es la "herencia múltiple", dado que una clase puede implementar varias interfaces al mismo tiempo. Así como las clases abstractas buscan ser una plantilla general para sus clases hijas, las interfaces buscan ser plantillas de igual manera pero de sus COMPORTAMIENTOS (métodos).

**Ejemplo de Código:**

**Interface**

```java
public interface Animal {
    void hacerSonido();
    void moverse();
}
```


[![](./resources/interfaces-screenshot.png)](https://youtu.be/hfwtzjOhvKk)

### Diferencias entre clases abstractas e interfaces

[![](./resources/clase-abstracta-vs-interfaces-screenshot.png)](https://youtu.be/Id3kTuEPB_s)

### ¿Cuándo elegir clases abstractas y cuando interfaces?

[![](./resources/clase-abstracta-vs-interface-2-screenshot.png)](https://youtu.be/riGDna9zme4)

---

## Materiales/ejercicios prácticos complementarios

- [Interfaces con figuras geométricas](https://youtu.be/VMbt-Zc5OZs?si=1KTg0lO99CUu7ux0)
    
- [Interfaces y clases abstractas con seres vivos](https://youtu.be/J2aXYUA1h20?si=ZAbi2wgVpxDt5agH)
    
- [Clases abstractas e interfaces con Pokemon](https://youtu.be/O3hKxRLkLVU?si=JF6pgvJY9CiY530d)

