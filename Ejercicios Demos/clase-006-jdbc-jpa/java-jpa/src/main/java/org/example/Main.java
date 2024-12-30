package org.example;

import org.example.controllers.MovieController;
import org.example.entities.Movie;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        MovieController movieController = new MovieController();
        Movie nuevaPelicula = new Movie(null, "Nueva pelicula"
                                        , 6.5,7
                                        , LocalDateTime.of(1990,2,1,0,0,0)
                                        , 220,4);

        /*Crear una Pelicula*/
       /* movieController.create(nuevaPelicula);*/

        /*Buscar pelicula*/
        Integer idBuscado = 2;
        Movie pelicula = movieController.findOne(idBuscado);

       /* System.out.println(pelicula);*/

        // Buscar todas las peliculas
        List<Movie> todasLasPeliculas =  movieController.findAll();

       /* for (Movie movie: todasLasPeliculas) {
            System.out.println(movie);
        }*/

        //Actualizar la pelicula 6
        /*Movie actualizarPelicula = movieController.findOne(6);
        actualizarPelicula.setTitle("Volver al Futuro");
        movieController.update(actualizarPelicula);*/

        Integer idEliminar = 60;
        movieController.delete(idEliminar);
    }
}