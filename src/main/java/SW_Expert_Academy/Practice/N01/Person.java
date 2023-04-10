package SW_Expert_Academy.Practice.N01;

public class Person {
    private String name;
    private int age;
    private String home;

    public Person(String name, int age, String home) {
        this.name = name;
        this.age = age;
        this.home = home;
    }

    public void sayAboutMe() {
        System.out.println("hello my name is " + name + ". I am " + age + " years old.");
    }

    public void sayAboutHome() {
        System.out.println("I live in " + home);
    }
}
