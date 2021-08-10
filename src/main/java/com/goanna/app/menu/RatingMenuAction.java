package com.goanna.app.menu;

import com.goanna.app.data.Movie;
import com.goanna.app.data.MovieDataSource;

import java.util.List;
import java.util.Scanner;

public class RatingMenuAction extends MenuAction {
    @Override
    public String displayOptions() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       Movies by minimum ratings (Integer): Enter minimum rating between 1 to 10 ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");

        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();

        return String.valueOf(choice);
    }

    @Override
    public MenuAction getNextMenuAction() {
        return MainMenuAction.MAIN_MENU_ACTION;
    }

    @Override
    public void executeOption(String value) {
        int minumRating = Integer.valueOf(value);

        List<Movie> movies = MovieDataSource.getMoviesByMinimumRating(minumRating);
        for (Movie m : movies) {
            System.out.println(m.getTitle());
        }
    }
}
