package movieticketbookingsystem;

public class Theater {
    private final String id;
    private final String name;
    private final String location;
    private final String type;

    public Theater(String id, String name, String location, String type) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getType() {
        return type;
    }
}
