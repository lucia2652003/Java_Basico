### Ejercicio Nº 1 - Collections, Clases Abstractas e Interfaces - Grupal

Un **sistema de gestión de vehículos** necesita ser desarrollado para una futura implementación para una tienda de venta de autos. Se requiere utilizar para su implementación tanto clases abstractas como interfaces para modelar este sistema.

a) **Clase Abstracta Vehiculo:** Crear una clase abstracta llamada Vehiculo con los siguientes atributos: id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehículo.
    
b) **Interfaces:** Crea dos interfaces llamadas Electrico y Combustion con métodos abstractos cargarEnergia() y recargarCombustible() respectivamente. En ambos casos, cuando se implementen en sus respectivas clases, deben mostrar un mensaje de qué tipo de recarga están haciendo.
    
c) **Clase Auto:** Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico. Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs). Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
    
d) **Clase Camioneta:** Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
    
e) **Clase Moto:** Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion. Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor. Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
    
f) **Main:** En el programa principal, crea objetos de diferentes tipos de vehículos (autos eléctricos, camionetas de combustión, motos de combustión) y añádelos a un ArrayList de tipo Vehiculo. Muestra información sobre cada uno de ellos, incluyendo el calculo de la antigüedad y la recarga de energía o combustible según corresponda.
    
g) **Polimorfismo:** Recorrer el ArrayList de Vehículos y mostrar la información de cada uno de ellos.
    

**Nota:** _Recuerda que la antigüedad de un vehículo se calcula restando del año actual el año de fabricación del auto. Por ejemplo: 2023 - 2018= 5 años de antigüedad_

---

### Ejercicio Nº 2 - Collections - Individual (Extra/Opcional)

Un administrador de una **tienda de electrónica** necesita un programa para gestionar los **productos** en su inventario. Para ello, necesita la creación de una clase Producto que cuente con los siguientes datos: código, nombre, marca, tipo, precio costo, precio venta, cantidad en stock.

A partir de esto, realizar las siguientes acciones en el programa desarrollado:

a) Crear 10 objetos de tipo Producto con sus correspondientes valores cargados (por ejemplo, teléfono, laptop, auriculares/cascos, cargador, tablet, etc).
    
b) Guardar estos objetos creados en un ArrayList.
    
c) Recorrer el ArrayList y determinar el producto con el mayor precio de venta.
    
d) Recorrer el ArrayList y determinar el producto con el menor precio de costo.
    
e) Borrar el producto que se encuentre en la posición 5 del ArrayList.
    
f) Determinar el producto que tenga la mayor cantidad en stock. A ese producto, descontarle 3 unidades del stock y actualizar el registro en la lista en base a eso.
    
g) Mostrar siempre por consola un mensaje informativo luego de resolver cada punto.
   
---

## Resoluciones
  
📌 Recuerda que las resoluciones estarán habilitadas el último día de la semana luego de la revisión en la clase en vivo.

📌 Asegúrate de haber resuelto y subido tus resoluciones propias a tu repositorio antes de que se habiliten las resoluciones semanales.