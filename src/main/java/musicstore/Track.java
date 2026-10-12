package musicstore;

public class Track implements Identifiable<Integer> {

    private final int number;
    private final String name;

    public Track(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public Integer getId() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Track{" + number + ", '" + name + "'}";
    }
}