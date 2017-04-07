import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Shoma on 07.04.2017.
 */
public class ConcurrencyLockExample implements Runnable{

    private Main resource;
    private Lock lock;

    public ConcurrencyLockExample(Main r){
        this.resource = r;
        this.lock = new ReentrantLock();
    }

    @Override
    public void run() {
        try {
            System.out.println("Лочим на 10 сек");
            if(lock.tryLock(10, TimeUnit.SECONDS)){
                resource.doSomething();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            System.out.println("Тут мы типа снимаем лок : " + Thread.currentThread().getName());
            lock.unlock();
        }
        System.out.println("Щяз будет логгироваться ConcurrencyLock : " +Thread.currentThread().getName());
        resource.doLogging();
    }

}
