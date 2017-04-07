/**
 * Created by Shoma on 07.04.2017.
 */
public class Zapusk {
    public static void main(String[] args) {
        Main main = new Main();
        ConcurrencyLockExample c = new ConcurrencyLockExample(main);
        ConcurrencyLockExample c1 = new ConcurrencyLockExample(main);
        SynchronizedLockExample s = new SynchronizedLockExample(main);
        SynchronizedLockExample s1 = new SynchronizedLockExample(main);
        c.run();
        c1.run();
        s.run();
        s1.run();
    }
}
