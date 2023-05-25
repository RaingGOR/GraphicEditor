public class Main {
    public static int randomRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}