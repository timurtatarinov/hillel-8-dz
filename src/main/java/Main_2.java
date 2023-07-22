public class Main_2 {

    public static void main(String[] args) {

        Storage<Integer, String> storage = new Storage<Integer, String>();
        storage.put(15, "Furniture");
        storage.put(55, "Box2");
        storage.put(48, "Instrument");
        storage.put(33, "Box");
        storage.put(20, "Dishes");

        System.out.println(storage.getBox(33));
        System.out.println(storage.getBox(55));
    }

}