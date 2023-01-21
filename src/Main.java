public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicBox = new MagicBox<>(3);
        System.out.println(magicBox.add(1));
        System.out.println(magicBox.add(7));
        System.out.println(magicBox.add(4));
        System.out.println(magicBox.pick());

        MagicBox<String> magicBox1 = new MagicBox<>(2);
        System.out.println(magicBox1.add("A"));
        System.out.println(magicBox1.add("B"));
        System.out.println(magicBox1.pick());
    }
}