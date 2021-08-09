package com.goanna.app.data;

import java.util.ArrayList;
import java.util.List;

public class MovieDataSource {

    private static final List<Movie> MOVIE_DATA_SOURCE = new ArrayList<>();


    static {
        Movie m1 = new Movie();
        m1.setTitle("T1");
        m1.setActor("A1");
        m1.setGenre(Genre.ACTION);
        m1.setRating(7.8);
        m1.setYear(2000);
        MOVIE_DATA_SOURCE.add(m1);

        Movie m2 = new Movie();
        m2.setTitle("T2");
        m2.setActor("A2");
        m2.setGenre(Genre.ACTION);
        m2.setRating(5.8);
        m2.setYear(2004);
        MOVIE_DATA_SOURCE.add(m2);

        Movie m3 = new Movie();
        m3.setTitle("T3");
        m3.setActor("A3");
        m3.setGenre(Genre.ACTION);
        m3.setRating(6.8);
        m3.setYear(2003);
        MOVIE_DATA_SOURCE.add(m3);

        Movie m4 = new Movie();
        m4.setTitle("T4");
        m4.setActor("A4");
        m4.setGenre(Genre.ACTION);
        m4.setRating(8.8);
        m4.setYear(2002);
        MOVIE_DATA_SOURCE.add(m4);

    }

    public static List<Movie> getMoviesByGenre(Genre genre) {
        List<Movie> movies = new ArrayList<>();
        for (Movie m : MOVIE_DATA_SOURCE) {
            if (genre == m.getGenre()) {
                movies.add(m);
            }
        }
        return movies;
    }

    public static List<Movie> getMoviesByYear(int fromYear, int toYear) {
        List<Movie> movies = new ArrayList<>();
        for (Movie m : MOVIE_DATA_SOURCE) {
            if (m.getYear() >= fromYear && m.getYear() <= toYear) {
                movies.add(m);
            }
        }
        return movies;
    }

    public static List<Movie> getMoviesByActor(String actor) {
        List<Movie> movies = new ArrayList<>();
        for (Movie m : MOVIE_DATA_SOURCE) {
            if (m.getActor().equalsIgnoreCase(actor)) {
                movies.add(m);
            }
        }
        return movies;
    }

}
