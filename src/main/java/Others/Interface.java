package Others;

interface Animal {
    public abstract void say();
}

class Cat implements Animal {
    @Override
    public void say() {
        System.out.println("meow!");
    }
}

class Dog implements Animal {
    @Override
    public void say() {
        System.out.println("wow!");
    }
}

public class Interface {
    public static void main (String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.say();
        dog.say();
    }
}
