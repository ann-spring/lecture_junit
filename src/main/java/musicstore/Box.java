package musicstore;

public class Box<T> {

    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T get() {
        return item;
    }

    public void set(T item) {
        this.item = item;
    }

    public boolean isEmpty() {
        return item == null;
    }

    public static <T> void copyFrom(Box<? extends T> source, Box<? super T> destination) {
        destination.set(source.get());
    }

    public static <T> void copyAll(Box<? extends T> source, Box<? super T>... destinations) {
        for (Box<? super T> destination : destinations) {
            destination.set(source.get());
        }
    }
}