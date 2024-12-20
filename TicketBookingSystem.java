package movieticketbookingsystem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class TicketBookingSystem {
    private static TicketBookingSystem instance;
    private final Map<String, Booking> bookings;

    private TicketBookingSystem() {
        bookings = new ConcurrentHashMap<>();
    }

    public static synchronized TicketBookingSystem getInstance() {
        if (instance == null) {
            instance = new TicketBookingSystem();
        }
        return instance;
    }

    public void addBooking(Booking booking) {
        bookings.put(booking.getId(), booking);
        System.out.println("Booking added successfully: " + booking.getId());
    }

    public Booking getBooking(String bookingId) {
        return bookings.get(bookingId);
    }
}
