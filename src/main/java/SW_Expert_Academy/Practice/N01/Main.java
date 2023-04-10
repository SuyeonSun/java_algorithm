package SW_Expert_Academy.Practice.N01;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("a", 1, "home");
        person.sayAboutMe();
        person.sayAboutHome();

        Student student = new Student("b", 2, "home", "Seoul");
        student.sayAboutMe();
        student.sayAboutHome();
    }
}
