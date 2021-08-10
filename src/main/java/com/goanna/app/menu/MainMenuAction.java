package com.goanna.app.menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainMenuAction extends MenuAction {

    public static final Map<String, String> MAIN_MENU = new HashMap<>();

    public static final MainMenuAction MAIN_MENU_ACTION = new MainMenuAction();
    public static final GenreMenuAction GENRE_MENU_ACTION = new GenreMenuAction();
    public static final ExitMenuAction EXIT_MENU_ACTION = new ExitMenuAction();
    public static final ActorMenuAction ACTOR_MENU_ACTION = new ActorMenuAction();
    public static final TitleMenuAction TITLE_MENU_ACTION = new TitleMenuAction();
    public static final RatingMenuAction RATING_MENU_ACTION = new RatingMenuAction();
    public static final YearMenuAction YEAR_MENU_ACTION = new YearMenuAction();


    static {
        MAIN_MENU.put("1", "Genre");
        MAIN_MENU.put("2", "Actor");
        MAIN_MENU.put("3", "Rating");
        MAIN_MENU.put("4", "Title");
        MAIN_MENU.put("5", "Year");
        MAIN_MENU.put("X", "Exit");
    }

    @Override
    public String displayOptions() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                     *** Welcome to Movie Reviews ***");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       MAIN MENU - Select Movies by");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");

        for (Map.Entry<String, String> entry : MAIN_MENU.entrySet()) {
            System.out.println(entry.getKey() + ") " + entry.getValue());
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------\n");


        return null;
    }

    @Override
    public void executeOption(String choice) {


    }

    @Override
    public MenuAction getNextMenuAction() {
        Scanner input = getUserInput();

        String choice = input.next();
        switch (choice) {
            case "1" : return GENRE_MENU_ACTION;
            case "2" : return ACTOR_MENU_ACTION;
            case "3" : return RATING_MENU_ACTION;
            case "4" : return TITLE_MENU_ACTION;
            case "5" : return YEAR_MENU_ACTION;
            case "X" : return EXIT_MENU_ACTION;
        }
        return this;
    }
}
