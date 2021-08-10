package com.goanna.app.menu;

import com.goanna.app.data.Genre;
import com.goanna.app.data.Movie;
import com.goanna.app.data.MovieDataSource;

import java.util.Scanner;

public class GenreMenuAction extends MenuAction {
    @Override
    public String displayOptions() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       Genre - Select Movies by");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");
        for (Genre genre : Genre.values()) {
            System.out.println(genre.getOption() + ") " + genre.getDescription());
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");
        Scanner input = new Scanner(System.in);

        //Validation
        //If X then exit
        String choice = input.next();
        return choice;
    }

    @Override
    public MenuAction getNextMenuAction() {
        pressAnyKeyToContinue();
        return new MainMenuAction();//TODO
    }

    @Override
    public void executeOption(String choice) {


        Genre selectedGenre = Genre.getGenreByOption(Integer.valueOf(choice));

        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       Genre - " + selectedGenre.getDescription());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");
        for (Movie m : MovieDataSource.getMoviesByGenre(selectedGenre)) {
            System.out.println(m.getTitle());
        }

    }
}
