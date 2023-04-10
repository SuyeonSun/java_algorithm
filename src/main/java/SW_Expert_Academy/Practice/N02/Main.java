package SW_Expert_Academy.Practice.N02;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudent("Berry", 1, 2);
        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.score);
    }
}
