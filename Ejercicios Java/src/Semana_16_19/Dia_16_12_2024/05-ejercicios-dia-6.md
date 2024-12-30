### Ejercicio Nº 1 - Herencia, Polimorfismo y Encapsulamiento - Individual

Crear una clase **"Animal"** con los atributos: id, nombre, edad, tipo de piel y tipo de alimentación (con sus métodos y constructores correspondientes). Agregar también un método llamado saludar que emita un mensaje por pantalla que diga “Hola, soy un animal”. A partir de esto hacer lo siguientes pasos:

a) Crear sus clases hijas que compartan sus atributos y métodos:
    
- **"Mamífero"** con atributos adicionales: número de patas, tipo de reproducción, color de pelaje, hábitat.
	
- **"Ave"** con atributos adicionales: envergadura de alas, tipo de vuelo, color de plumaje, tipo de pico.
	
- **"Reptil"** con atributos adicionales: longitud, tipo de escamas, tipo de veneno, hábitat.
        

b) Una vez creadas las clases, crear los siguientes métodos:
    
- **"Mamífero":** sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un mamífero".
	
- **"Ave":** sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un ave".
	
- **"Reptil":** sobrescribir el método saludar de la clase madre y colocar el mensaje "Hola, soy un reptil".
	
- c) En el método "main", crear un objeto de cada clase hija. Llamar a los 3 métodos saludar desde cada objeto.

- d) Crear un objeto de tipo animal e intentar asignarle al Mamífero creado… ¿Qué sucede? ¿Es posible hacer esto? ¿Se aplica alguna propiedad para esto?

- E) Cambiar el modificador de acceso de los métodos de "public" a "private". Intentar acceder desde el "main" a estos métodos. ¿Qué sucede? ¿Es posible hacer esto?
    

---

### Ejercicio Nº 2 - Herencia y Polimorfismo - Individual

Crear una clase llamada **Vestimenta** con los atributos: código, nombre, precio, marca, talla y color (con sus métodos y constructores correspondientes).

a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
    
- **Zapato:** material, tipoCierre
	
- **Pantalon:** estilo, tipoTejido
	
- **Camiseta:** manga, cuello
	
- **Sombrero:** tipo, tamaño
        
b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con parámetros para cada uno de ellos).
    
c) Crear los siguientes métodos (en cada subclase correspondiente):
    
- **Zapato:** método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).
	
- **Pantalon:** método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).
	
- **Camiseta:** método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).
	
- **Sombrero:** método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).
        
d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
    

**PISTA:** _Todos tendrán el mismo método, con el mismo nombre, pero únicamente cambia el mensaje que muestran. Tener en cuenta para esto la implementación de herencia y sobreescritura de métodos._

---

## Resoluciones
  
📌 Recuerda que las resoluciones estarán habilitadas el último día de la semana luego de la revisión en la clase en vivo.

📌 Asegúrate de haber resuelto y subido tus resoluciones propias a tu repositorio antes de que se habiliten las resoluciones semanales.

