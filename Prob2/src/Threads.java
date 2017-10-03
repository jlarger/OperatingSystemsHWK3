/**
 * Created by jameslarger on 10/3/17.
 */
public class Threads {
    public static void main(String[] args) {
        System.out.println("Hello");

        Resource newResourceInstance = new Resource();


        AThreads newThreadAObject = new AThreads(newResourceInstance);
        BThreads newThreadBObject = new BThreads(newResourceInstance);


        Thread aThread = new Thread(newThreadAObject);
        Thread bThread = new Thread(newThreadBObject);


        aThread.start();
        bThread.start();
    }
}
