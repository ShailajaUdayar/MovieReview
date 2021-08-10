package com.goanna.app.data;

import com.goanna.app.menu.MainMenuAction;
import com.goanna.app.menu.MenuAction;

public class MovieReviewApp {

    private static final MainMenuAction MAIN_MENU_ACTION = new MainMenuAction();

    public static void main(String[] args) {

        MAIN_MENU_ACTION.displayOptions();
        MenuAction nextMenu = MAIN_MENU_ACTION.getNextMenuAction();

        while (nextMenu != null) {
            String choice = nextMenu.displayOptions();
            nextMenu.executeOption(choice);
            nextMenu = nextMenu.getNextMenuAction();
        }
    }

}
