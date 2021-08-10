package com.goanna.app.data;

import com.goanna.app.menu.MainMenuAction;
import com.goanna.app.menu.MenuAction;

public class MovieReviewApp {

    public static void main(String[] args) {

        MainMenuAction.MAIN_MENU_ACTION.displayOptions();
        MenuAction nextMenu = MainMenuAction.MAIN_MENU_ACTION.getNextMenuAction();

        while (nextMenu != null) {
            String choice = nextMenu.displayOptions();
            nextMenu.executeOption(choice);
            nextMenu = nextMenu.getNextMenuAction();
        }
    }

}
