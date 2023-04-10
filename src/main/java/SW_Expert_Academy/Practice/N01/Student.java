package SW_Expert_Academy.Practice.N01;

public class Student extends Person {
    private String school;

    public Student(String name, int age, String home, String school) {
        super(name, age, home);
        this.school = school;
    }

    @Override
    public void sayAboutMe() {
        super.sayAboutMe();
        System.out.println("I am a Student.");
    }

    @Override
    public void sayAboutHome() {
        System.out.println("I studied at " + school + " University.");
    }
}
