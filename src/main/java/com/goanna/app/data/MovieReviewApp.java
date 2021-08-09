package com.goanna.app.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MovieReviewApp {

    public static final Map<String, String> MAIN_MENU = new HashMap<>();



    static {
        MAIN_MENU.put("1", "Genre");
        MAIN_MENU.put("2", "Actor");
        MAIN_MENU.put("3", "Rating");
        MAIN_MENU.put("4", "Title");
        MAIN_MENU.put("5", "Year");


    }
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                     *** Welcome to Movie Reviews ***");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       MAIN MENU - Select Movies by");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");

        for (Map.Entry<String, String> entry : MAIN_MENU.entrySet()) {
            System.out.println(entry.getKey() + ") " + entry.getValue());
        }


        System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");
        Scanner input = new Scanner(System.in);

        String choice = input.next();

        switch (choice) {
            case "1": {
                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n                                       Genre - Select Movies by");
                System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
                for (Genre genre : Genre.values()) {
                    System.out.println(genre.getOption() + ") " + genre.getDescription());
                }
                System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");

                choice = input.next();
                //Validation
                //If X then exit

                Genre selectedGenre = Genre.getGenreByOption(Integer.valueOf(choice));

                System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n                                       Genre - " + selectedGenre.getDescription());
                System.out.println("---------------------------------------------------------------------------------------------------------------------------\n");
                for (Movie m : MovieDataSource.getMoviesByGenre(selectedGenre)) {
                    System.out.println(m.getTitle());
                }
                System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");

            }
        }

    }
}
