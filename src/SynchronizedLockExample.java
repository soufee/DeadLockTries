/**
 * Created by Shoma on 07.04.2017.
 */
public class SynchronizedLockExample implements Runnable {

    private Main resource;

    public SynchronizedLockExample(Main r){
        this.resource = r;
    }

    @Override
    public void run() {
        synchronized (resource) {
            resource.doSomething();
        }
        System.out.println("Это логгинг из ресурса synchronize : "+Thread.currentThread().getName());
        resource.doLogging();
    }
}
