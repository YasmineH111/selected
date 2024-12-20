package movieticketbookingsystem.factory;

import movieticketbookingsystem.Theater;

public class TheaterFactory {
    public static Theater createTheater(String type, String id, String name, String location) {
        switch (type.toLowerCase()) {
            case "cinema hall":
                return new Theater(id, name, location, "Cinema Hall");
            case "imax":
                return new Theater(id, name, location, "IMAX Theater");
            default:
                throw new IllegalArgumentException("Unknown theater type: " + type);
        }
    }
}
