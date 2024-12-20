package movieticketbookingsystem;

public class PrintUtils {
    public static void printMovie(Movie movie) {
        System.out.println("----- Movie Details -----");
        System.out.println("ID: " + movie.getId());
        System.out.println("Name: " + movie.getName());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Duration: " + movie.getDuration() + " minutes");
        System.out.println("-------------------------");
    }

    public static void printTheater(Theater theater) {
        System.out.println("----- Theater Details -----");
        System.out.println("ID: " + theater.getId());
        System.out.println("Name: " + theater.getName());
        System.out.println("Location: " + theater.getLocation());
        System.out.println("Type: " + theater.getType());
        System.out.println("---------------------------");
    }

    public static void printBooking(Booking booking) {
        System.out.println("----- Booking Details -----");
        System.out.println("Booking ID: " + booking.getId());
        System.out.println("User ID: " + booking.getUserId());
        System.out.println("Movie: " + booking.getMovie().getName());
        System.out.println("Theater: " + booking.getTheater().getName());
        System.out.println("Number of Tickets: " + booking.getNumberOfTickets());
        System.out.println("Total Price: $" + booking.getTotalPrice());
        System.out.println("---------------------------");
    }
}
