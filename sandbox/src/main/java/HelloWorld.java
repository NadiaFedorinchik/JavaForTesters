public class HelloWorld {
    public static void main(String[] args) {
        int s = 3700;
        int sec = s % 60;
        int m = s / 60;
        int min = m % 60;
        int h = m / 60;
        System.out.println(h + " часов " + min + " минут " + sec +     "секунд");
    }
}
