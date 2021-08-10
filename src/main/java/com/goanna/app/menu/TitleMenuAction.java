package com.goanna.app.menu;

import com.goanna.app.data.Movie;
import com.goanna.app.data.MovieDataSource;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TitleMenuAction extends MenuAction {

    @Override
    public String displayOptions() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       Movies by Title ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");

        int i = 1;

        Map<Integer, Movie> moviesMap = new HashMap<>();
        for (Movie m : MovieDataSource.MOVIE_DATA_SOURCE) {
            moviesMap.put(i, m);
            System.out.println(i + ") " + m.getTitle());
            i++;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        return  moviesMap.get(choice).getTitle();
    }

    @Override
    public MenuAction getNextMenuAction() {
        return MainMenuAction.MAIN_MENU_ACTION;
    }

    @Override
    public void executeOption(String value) {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       Movie Title : " + value);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");

        for (Movie m : MovieDataSource.MOVIE_DATA_SOURCE) {
            if (m.getTitle().equals(value)) {
                System.out.println("                                       Actor: " + m.getActor());
                System.out.println("                                       Year: " + m.getYear());
                System.out.println("                                       GENRE: " + m.getGenre());
                System.out.println("                                       Rating: " + m.getRating());
            }
        }
    }
}
