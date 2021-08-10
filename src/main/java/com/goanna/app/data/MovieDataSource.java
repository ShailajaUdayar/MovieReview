package com.goanna.app.data;

import java.util.*;

public class MovieDataSource {

    public static final List<Movie> MOVIE_DATA_SOURCE = new ArrayList<>();


    static {
        Movie m1 = new Movie();
        m1.setTitle("The Shawshank Redemption");
        m1.setActor("Morgan Freeman");
        m1.setGenre(Genre.DRAMA);
        m1.setRating(9.3);
        m1.setYear(1994);
        MOVIE_DATA_SOURCE.add(m1);

        Movie m2 = new Movie();
        m2.setTitle("The Dark Knight");
        m2.setActor("Christian Bale");
        m2.setGenre(Genre.ACTION);
        m2.setRating(9.0);
        m2.setYear(2008);
        MOVIE_DATA_SOURCE.add(m2);

        Movie m3 = new Movie();
        m3.setTitle("Inception");
        m3.setActor("Leonardo DiCaprio");
        m3.setGenre(Genre.SCIFI);
        m3.setRating(8.8);
        m3.setYear(2010);
        MOVIE_DATA_SOURCE.add(m3);

        Movie m4 = new Movie();
        m4.setTitle("The Conjuring");
        m4.setActor("Patrick Wilson");
        m4.setGenre(Genre.HORROR);
        m4.setRating(7.5);
        m4.setYear(2013);
        MOVIE_DATA_SOURCE.add(m4);

        Movie m5 = new Movie();
        m5.setTitle("The Suicide Squad");
        m5.setActor("Margot Robbie");
        m5.setGenre(Genre.COMEDY);
        m5.setRating(7.6);
        m5.setYear(2021);
        MOVIE_DATA_SOURCE.add(m5);

        Movie m6 = new Movie();
        m6.setTitle("Edge of Tomorrow");
        m6.setActor("Tom Cruise");
        m6.setGenre(Genre.SCIFI);
        m6.setRating(7.9);
        m6.setYear(2014);
        MOVIE_DATA_SOURCE.add(m6);

        Movie m7 = new Movie();
        m7.setTitle("Taken");
        m7.setActor("Liam Neeson");
        m7.setGenre(Genre.ACTION);
        m7.setRating(7.9);
        m7.setYear(2008);
        MOVIE_DATA_SOURCE.add(m7);

        Movie m8 = new Movie();
        m8.setTitle("Fight Club");
        m8.setActor("Brad Pitt");
        m8.setGenre(Genre.DRAMA);
        m8.setRating(8.8);
        m8.setYear(1999);
        MOVIE_DATA_SOURCE.add(m8);

        Movie m9 = new Movie();
        m9.setTitle("Jungle Cruise");
        m9.setActor("Dwayne Johnson");
        m9.setGenre(Genre.COMEDY);
        m9.setRating(6.7);
        m9.setYear(2021);
        MOVIE_DATA_SOURCE.add(m9);

        Movie m10 = new Movie();
        m10.setTitle("It (I)");
        m10.setActor("Jaedon Martell");
        m10.setGenre(Genre.HORROR);
        m10.setRating(7.3);
        m10.setYear(2017);
        MOVIE_DATA_SOURCE.add(m10);

        Movie m11 = new Movie();
        m11.setTitle("The Departed");
        m11.setActor("Leonardo DiCaprio");
        m11.setGenre(Genre.DRAMA);
        m11.setRating(8.5);
        m11.setYear(2006);
        MOVIE_DATA_SOURCE.add(m11);

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

    public static Map<Integer, String> getAvailableActors() {
        Set<String> actorSet = new TreeSet<>();

        for (Movie m : MOVIE_DATA_SOURCE) {
            actorSet.add(m.getActor());

        }

        Map<Integer, String> actors = new HashMap<>();
        int i = 1;
        for (String a : actorSet) {
            actors.put(i, a);
            i++;
        }
        return actors;
    }

}
