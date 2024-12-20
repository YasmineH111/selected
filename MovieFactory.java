package movieticketbookingsystem.factory;

import movieticketbookingsystem.Movie;

public class MovieFactory {
    public static Movie createMovie(String genre, String id, String name, int duration) {
        switch (genre.toLowerCase()) {
            case "action":
                return new Movie(id, name, "Action Movie", duration);
            case "comedy":
                return new Movie(id, name, "Comedy Movie", duration);
            case "drama":
                return new Movie(id, name, "Drama Movie", duration);
            default:
                throw new IllegalArgumentException("Unknown genre: " + genre);
        }
    }
}
