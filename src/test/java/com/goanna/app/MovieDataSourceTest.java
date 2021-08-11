package com.goanna.app;

import com.goanna.app.data.Genre;
import com.goanna.app.data.Movie;
import com.goanna.app.data.MovieDataSource;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MovieDataSourceTest {

    @Test
    public void testGetMoviesByGenre() {
        List<Movie> moviesByComedy = MovieDataSource.getMoviesByGenre(Genre.COMEDY);
        assertNotNull(moviesByComedy);
        assertFalse(moviesByComedy.isEmpty());
        assertEquals(2, moviesByComedy.size());
        Movie m1 = moviesByComedy.get(0);
        assertEquals("The Suicide Squad", m1.getTitle());
        assertEquals(2021, m1.getYear());
        assertEquals("Margot Robbie", m1.getActor());
        assertEquals(7.6, m1.getRating());
        assertEquals(Genre.COMEDY, m1.getGenre());


        Movie m2 = moviesByComedy.get(1);
        assertEquals("Jungle Cruise", m2.getTitle());
        assertEquals(2021, m2.getYear());
        assertEquals("Dwayne Johnson", m2.getActor());
        assertEquals(6.7, m2.getRating());
        assertEquals(Genre.COMEDY, m2.getGenre());
    }

    @Test
    public void testGetMoviesByActor() {
        List<Movie> moviesByActor = MovieDataSource.getMoviesByActor("Liam Neeson");
        assertNotNull(moviesByActor);
        assertFalse(moviesByActor.isEmpty());
        assertEquals(1, moviesByActor.size());

        Movie m1 = moviesByActor.get(0);
        assertEquals("Taken", m1.getTitle());
        assertEquals(2008, m1.getYear());
        //assertEquals("Liam Neeson", m1.getActor());
        assertEquals(7.9, m1.getRating());

        List<Movie> moviesByActor2 = MovieDataSource.getMoviesByActor("Dwayne Johnson");
        Movie m2 = moviesByActor2.get(0);
        assertEquals("Jungle Cruise", m2.getTitle());
        assertEquals(2021, m2.getYear());
        //assertEquals("Dwayne Johnson", m2.getActor());
        assertEquals(6.7, m2.getRating());

    }

    @Test
    public void testGetMoviesByMinimumRating() {
        List<Movie> moviesByMinimumRating = MovieDataSource.getMoviesByMinimumRating(9);
        assertNotNull(moviesByMinimumRating);
        assertFalse(moviesByMinimumRating.isEmpty());
        assertEquals(2, moviesByMinimumRating.size());

        Movie m1 = moviesByMinimumRating.get(1);
        assertEquals("The Dark Knight", m1.getTitle());
        assertEquals(2008, m1.getYear());
       // assertEquals("Liam Neeson", m1.getActor());
        assertEquals(9, m1.getRating());

        List<Movie> moviesByMinimumRating2 = MovieDataSource.getMoviesByMinimumRating(8);
        assertNotNull(moviesByMinimumRating2);
        assertFalse(moviesByMinimumRating2.isEmpty());
        assertEquals(5, moviesByMinimumRating2.size());

        Movie m2 = moviesByMinimumRating2.get(2);
        assertEquals("Inception", m2.getTitle());
        assertEquals(2010, m2.getYear());
       // assertEquals("Leonardo DiCaprio", m2.getActor());
        assertEquals(8.8, m2.getRating());

    }

    @Test
    public void testGetMoviesByMinimumYear() {
        List<Movie> moviesByMinimumYear = MovieDataSource.getMoviesByMinimumYear(2014);
        assertNotNull(moviesByMinimumYear);
        assertFalse(moviesByMinimumYear.isEmpty());
        assertEquals(4, moviesByMinimumYear.size());

        Movie m1 = moviesByMinimumYear.get(1);
        assertEquals("Edge of Tomorrow", m1.getTitle());
        assertEquals(2014, m1.getYear());
        assertEquals("Tom Cruise", m1.getActor());


        List<Movie> moviesByMinimumYear2 = MovieDataSource.getMoviesByMinimumYear(2020);
        assertNotNull(moviesByMinimumYear2);
        assertFalse(moviesByMinimumYear2.isEmpty());
        assertEquals(2, moviesByMinimumYear2.size());

        Movie m2 = moviesByMinimumYear2.get(0);
        assertEquals("The Suicide Squad", m2.getTitle());
        assertEquals(2021, m2.getYear());
        assertEquals("Margot Robbie", m2.getActor());


    }



}