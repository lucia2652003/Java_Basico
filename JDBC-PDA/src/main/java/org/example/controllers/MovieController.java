package org.example.controllers;

import org.example.entities.Movie;
import org.example.persistence.MovieJPA;

import java.util.List;

public class MovieController {

    MovieJPA movieJPA = new MovieJPA();

    public void create(Movie nueva) {
        movieJPA.create(nueva);
    }

    public Movie findMovie(Integer idBuscar) {
        return movieJPA.findMovie(idBuscar);
    }

    public List<Movie> findAll() {
        return movieJPA.findAll();
    }

    public void updateMovie(Movie peliculaAnt) {
        movieJPA.updateMovie(peliculaAnt);
    }

    public void delete(Integer idEliminar) {
        movieJPA.delete(idEliminar);
    }
}
