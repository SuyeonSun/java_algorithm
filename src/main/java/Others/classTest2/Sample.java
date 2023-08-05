package Others.classTest2;

public class Sample {
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update" + myCounter.count);
        Updater myUpdater = new Updater();
        myUpdater.update(myCounter.count);
        System.out.println("after update" + myCounter.count);
    }
}
