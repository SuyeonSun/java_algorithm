package Others;
// package는 많은 클래스들을 체계적으로 관리하기 위함
// 클래스의 전체 이름은 패키지명 + 클래스명
// Car 클래스가 com.mycompany 패키지에 속해있다면, com.mycompany.Car


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {
    public static void main(String[] args) {
        // =============== 예제1 ===============
        List<String> list = Arrays.asList("이름1", "이름2", "이름3");

        // Stream: 물고기의 이동
        Stream<String> stream = list.stream();
        // stream.forEach(name -> System.out.println(name));
        stream.forEach(System.out::println);
        // map: 물고기 상자에 담기
        // collect: 상자 운반 // 데이터의 변형 등의 처리를 하고 자료형으로 변환

        // =============== 예제2 ===============
        String[] arr1 = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(arr1);
        Stream<String> stream1OfArrayPart =
                Arrays.stream(arr1, 1, 3); // 1~2 요소 [b, c]
    }
}
