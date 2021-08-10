package com.goanna.app;

import com.goanna.app.data.Genre;
import com.goanna.app.data.Movie;
import com.goanna.app.data.MovieDataSource;
import org.junit.jupiter.api.Test;

import java.util.List;

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
}