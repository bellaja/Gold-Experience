import java.util.Random;

public class MagicBox<T> {
    private int size;
    private T[] items;

    public MagicBox(int size) {
        this.size = size;
        items = (T[]) new Object[size];
    }

    public boolean add(T item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() {
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null) {
                throw new RuntimeException("Коробка не заполнена!");
            }
        }

        Random random = new Random();
        int randomInt = random.nextInt(size);
        return items[randomInt];
    }


}

