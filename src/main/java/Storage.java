import java.util.Arrays;
import java.util.NoSuchElementException;

public class Storage <Integer, Box> {

    private Registration<Integer, Box> [] registrations = new Registration[10];

    int size = 0;

    public Box getBox( Integer key ) {
        for ( Registration<Integer, Box> e : registrations ) {
            if ( key.equals( e.getKey() ) ) {
                return e.getValue();
            }
        }
        throw new NoSuchElementException();
    }

    public void put( Integer key, Box value ) {
        Registration<Integer, Box> registration = new Registration<Integer, Box> (key, value);
        if ( size > registrations.length ) {
            grow();
        }
        registrations[size] = registration;
        size++;
    }

    private class Registration<K, V> {

        private K key;
        private V value;

        public Registration( K key, V value ) {
            this.key = key;
            this.value = value;
        }

        public K getKey() { return key; }
        public V getValue() { return value; }

    }

    public  void grow() {
        registrations = Arrays.copyOf( registrations, registrations.length + 1 );
    }

}