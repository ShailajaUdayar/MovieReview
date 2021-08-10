package com.goanna.app.menu;

import com.goanna.app.data.Movie;
import com.goanna.app.data.MovieDataSource;

import java.util.List;
import java.util.Scanner;

public class YearMenuAction extends MenuAction {
    @Override
    public String displayOptions() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       Movies by minimum year (Integer): Enter minimum year ");
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
        int minimumYear = Integer.valueOf(value);

        List<Movie> movies = MovieDataSource.getMoviesByMinimumYear(minimumYear);
        for (Movie m : movies) {
            System.out.println(m.getTitle() + " (" + m.getYear() + ")");
        }
    }
}
