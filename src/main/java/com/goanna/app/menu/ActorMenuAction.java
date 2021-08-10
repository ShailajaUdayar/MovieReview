package com.goanna.app.menu;

import com.goanna.app.data.Movie;
import com.goanna.app.data.MovieDataSource;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ActorMenuAction extends MenuAction {
    @Override
    public String displayOptions() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       Actor - Select Movies by Actor ");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");
        Map<Integer, String> actorsMap = MovieDataSource.getAvailableActors();
        for (Integer key : actorsMap.keySet()) {
            System.out.println(key + ") " + actorsMap.get(key));
        }
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        String actorSelected = actorsMap.get(choice);
        return actorSelected;

    }

    @Override
    public MenuAction getNextMenuAction() {
        return MainMenuAction.MAIN_MENU_ACTION;
    }

    @Override
    public void executeOption(String choice) {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\n                                       Movies by Actor " + choice);
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------\n");
        List<Movie> movies = MovieDataSource.getMoviesByActor(choice);
        for (Movie m : movies) {
            System.out.println(m.getTitle());
        }
    }
}
