package Others;

public class Member {
    private String name;      // 필수 인자
    private String location;  // 선택적 인자
    private String hobby;     // 선택적 인자

    // 필수 생성자
    public Member(String name) {
        this(name, "출신지역 비공개", "취미 비공개");
    }

    // 1 개의 선택
    public Member(String name, String location) {
        this(name, location, "취미 비공개");
    }

    // 모든 선택적
    public Member(String name, String location, String hobby) {
        this.name = name;
        this.location = location;
        this.hobby = hobby;
    }

    public Member() {}

    public static void main(String[] args) {
        Member member = new Member("이름");
        System.out.println(member.name);
        System.out.println(member.location);
        System.out.println(member.hobby);

        Member member2 = new Member();
        System.out.println(member2.name);
    }
}
