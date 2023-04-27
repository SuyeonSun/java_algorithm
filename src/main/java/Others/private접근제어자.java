package Others;

public class private접근제어자 {
    public static void main(String[] args) {
        Person person = new Person();
        person.name = "Jack";
        System.out.println(person.name);

        // person.weight = 70.0; // 에러
        person.setWeight(70.0);
        System.out.println(person.getWeight());

        Member member = new Member();
    }
}
