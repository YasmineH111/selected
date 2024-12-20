package movieticketbookingsystem;

public class SessionManager {
    private static SessionManager instance;

    private SessionManager() {}

    public static synchronized SessionManager getInstance() {
        if (instance == null) {
            instance = new SessionManager();
        }
        return instance;
    }

    public void createSession(String userId) {
        System.out.println("Session created for user: " + userId);
    }

    public void endSession(String userId) {
        System.out.println("Session ended for user: " + userId);
    }
}
