/**
 * Created by Shoma on 07.04.2017.
 */
public class Main {
    public void doSomething(){


        try {
            Thread.sleep(1000);
            System.out.println("Типа работаем с базой данных");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void doLogging(){

        try {
            Thread.sleep(1000);
            System.out.println("Тут типа логируется");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
