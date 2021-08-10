package com.goanna.app.data;

public enum Genre {
    SCIFI(1, "Sci-Fi"),
    HORROR(2, "Horror"),
    ACTION(3, "Action"),
    DRAMA(4, "Drama"),
    COMEDY(5, "Comedy");

    private final int option;
    private final String description;

    Genre(int option, String description) {
        this.option = option;
        this.description = description;
    }

    public int getOption() {
        return option;
    }

    public String getDescription() {
        return description;
    }

    public static Genre getGenreByOption(int option) {
        for (Genre genre : Genre.values()) {
            if (genre.option == option) {
                return genre;
            }
        }
        throw new IllegalArgumentException("For Option [" + option + "] Genre not available");
    }

    public static Genre getGenreByDescription(String description) {

        for (Genre genre : Genre.values()) {
            if (genre.getDescription().equalsIgnoreCase(description)) {
                return genre;
            }
        }

        throw new IllegalArgumentException("For Description [" + description + "] Genre not available");

    }

}

