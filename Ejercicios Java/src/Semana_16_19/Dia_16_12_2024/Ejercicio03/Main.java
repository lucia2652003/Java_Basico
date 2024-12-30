package Semana_16_19.Dia_16_12_2024.Ejercicio03;

import Semana_16_19.Dia_16_12_2024.Ejercicio03.entities.*;

/*
*
* Ejercicio Nº 2 - Herencia y Polimorfismo - Individual
Crear una clase llamada Vestimenta con los atributos: código, nombre, precio, marca, talla y color
* (con sus métodos y constructores correspondientes).
a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
*
Zapato: material, tipoCierre
Pantalon: estilo, tipoTejido
Camiseta: manga, cuello
Sombrero: tipo, tamaño

b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta
* y almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero
* (crear un objeto con parámetros para cada uno de ellos).
*
c) Crear los siguientes métodos (en cada subclase correspondiente):

Zapato: método para mostrar un mensaje en pantalla que diga "Estos zapatos son de marca: " (mostrar marca).
Pantalon: método para mostrar un mensaje en pantalla que diga "Estos pantalones son de marca: " (mostrar estilo).
Camiseta: método para mostrar un mensaje en pantalla que diga "Esta camiseta es de marca: " (mostrar manga).
Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).

* d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
*
* PISTA: Todos tendrán el mismo método, con el mismo nombre, pero únicamente
* cambia el mensaje que muestran. Tener en cuenta para esto la implementación de herencia
* y sobreescritura de métodos.
*
* */
public class Main {
    public static void main(String[] args) {
        //b.)
        Vestimenta[] vestuario = new Vestimenta[9];

        vestuario[0] = new Zapato(1,"Deportiva",15.26F,"Nike",36,"negro","nailon","cordón");
        vestuario[1] = new Zapato(2,"Deportiva",36.05F,"Puma",42,"rosa","poliéster","cordón");
        vestuario[2] = new Zapato(3,"Deportiva",25.01F,"Air",35,"blanco","poliéster","cordón");
        vestuario[3] = new Pantalon(4, "Acampado",44.05F,"Levi's",44, "azul","campana","mezclilla");
        vestuario[4] = new Pantalon(5, "Short",63.02F,"Lee",25, "negro","bolsillo","mezclilla");
        vestuario[5] = new Pantalon(6, "Leggins",16.05F,"Adidas",33, "gris","ajustado","lycra");
        vestuario[6] = new Camiseta(7,"Deportiva",18.03F,"Nike",40,"verde","corta",null);
        vestuario[7] = new Camiseta(8,"Camisa",65.03F,"Stradivarius",55,"blanco","larga","abierto");
        vestuario[8] = new Sombrero(9,"Boina",24.21F, "Columbia",36,"negro","inglés","mediano");

        //d.)

        for (Vestimenta vestimenta : vestuario) {
            vestimenta.mostrarArticulo();
        }

    }
}
