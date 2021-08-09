package com.goanna.app.data;

public class Movie {

    private String title;
    private Genre genre;
    private String actor;
    private double rating;
    private int year;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Movie{");
        sb.append("title='").append(title).append('\'');
        sb.append(", genre=").append(genre);
        sb.append(", actor='").append(actor).append('\'');
        sb.append(", rating=").append(rating);
        sb.append(", year=").append(year);
        sb.append('}');
        return sb.toString();
    }
}
