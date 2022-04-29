public class Main2 {
    public static void main(String[] args) {
        // Main thread is executing lets change its name and make an exception and then see whats the compiler will print in the console
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("Jatin Main Thread");
        int x = 10;
        int y = x/0;
        System.out.println(y);
    }
}
