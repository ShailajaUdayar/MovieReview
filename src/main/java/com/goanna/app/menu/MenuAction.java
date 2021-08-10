package com.goanna.app.menu;

import java.util.Scanner;

public abstract class MenuAction {

    public abstract String displayOptions();

    public abstract MenuAction getNextMenuAction();

    public abstract void executeOption(String value);

    public Scanner getUserInput() {
        return new Scanner(System.in);
    }

    public void pressAnyKeyToContinue() {
        System.out.println("--------Press Any Key to Continue -------------------------------------------------------------------------------------------------------\n");
        try {
            System.in.read();
        } catch (Exception e) {

        }
    }
}
