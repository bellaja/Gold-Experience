public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(3);
        System.out.println(magicBox.add(1));
        System.out.println(magicBox.add(7));
        System.out.println(magicBox.pick());
    }
}