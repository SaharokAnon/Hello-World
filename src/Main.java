public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Cube cube1 = Cube.builder().width(5.0F).build();
        Pyramid pyramid1 = new Pyramid(5.0F,5.0F);
        System.out.println(cube1.getVolume());

        System.out.println(pyramid1.getWidth());
        System.out.println(pyramid1.getH());
        System.out.println(pyramid1.getVolume());

    }
}