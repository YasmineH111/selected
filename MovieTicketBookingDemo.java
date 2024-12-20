package movieticketbookingsystem;

import movieticketbookingsystem.factory.MovieFactory;
import movieticketbookingsystem.factory.TheaterFactory;

public class MovieTicketBookingDemo {
    public static void main(String[] args) {
        TicketBookingSystem bookingSystem = TicketBookingSystem.getInstance();
        SessionManager sessionManager = SessionManager.getInstance();

        String userId = "User123";
        sessionManager.createSession(userId);

        Movie movie1 = MovieFactory.createMovie("Action", "M1", "Fast & Furious", 120);
        Movie movie2 = MovieFactory.createMovie("Drama", "M2", "The Pursuit of Happyness", 135);

        Theater theater1 = TheaterFactory.createTheater("Cinema Hall", "T1", "City Cinema", "Downtown");
        Theater theater2 = TheaterFactory.createTheater("IMAX", "T2", "Grand IMAX", "Uptown");

        PrintUtils.printMovie(movie1);
        PrintUtils.printMovie(movie2);
        PrintUtils.printTheater(theater1);
        PrintUtils.printTheater(theater2);

        Booking booking1 = new Booking("B1", userId, movie1, theater1, 2, 300);
        bookingSystem.addBooking(booking1);

        PrintUtils.printBooking(booking1);
        sessionManager.endSession(userId);
    }
}
