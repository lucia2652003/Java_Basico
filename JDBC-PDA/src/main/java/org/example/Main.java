package org.example;

import org.example.controllers.MovieController;
import org.example.entities.Movie;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MovieController moviecontroller = new MovieController();


        //Inserción de datos a BD
        Movie nueva = new Movie(null,"Titanic",6.3,6
                                , LocalDateTime.of(2023,5,12,15,30,0)
                                ,120, 2);

        //moviecontroller.create(nueva);

        // Buscar movie
        int idBuscar = 6;
        /*Movie movieEncontrada = moviecontroller.findMovie(idBuscar);
        System.out.println(movieEncontrada);*/

        //Mostrar todas las peliculas
         /*List<Movie> peliculas =moviecontroller.findAll();

           for(Movie pelicula : peliculas){
            System.out.println(pelicula);
           }// fin for*/

        //Actualizar un movie
        /*Movie peliculaAnt = moviecontroller.findMovie(6);
        System.out.println("Antes \n "+peliculaAnt);
        peliculaAnt.setTitle("Jumanji");
        moviecontroller.updateMovie(peliculaAnt); //Actualizar el título en la DB
        System.out.println(peliculaAnt);*/

        //Eliminar movie
        moviecontroller.delete(idBuscar);
    }
}