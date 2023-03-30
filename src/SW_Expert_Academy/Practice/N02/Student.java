package SW_Expert_Academy.Practice.N02;

public class Student extends Person {
    public int score;

    public void setStudent(String name, int age, int score) {
        super.setPerson(name, age);
        this.score = score;
    }
}
