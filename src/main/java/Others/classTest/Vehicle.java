package Others.classTest;

abstract public class Vehicle {
    private int curX, curY;

    public void reportPosition() {
        System.out.println("현재 위치: " +  curX + " " + curY);
    }

    public abstract void addFuel();
}
