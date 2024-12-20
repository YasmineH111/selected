package movieticketbookingsystem;

public class Booking {
    private final String id;
    private final String userId;
    private final Movie movie;
    private final Theater theater;
    private final int numberOfTickets;
    private final double totalPrice;

    public Booking(String id, String userId, Movie movie, Theater theater, int numberOfTickets, double totalPrice) {
        this.id = id;
        this.userId = userId;
        this.movie = movie;
        this.theater = theater;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
    }

    public String getId() {
        return id;
    }

    public String getUserId() {
        return userId;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
