package post1;


import java.util.Arrays;
import java.util.List;

public class StreamAPI2 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");

        // STream 연산이 연결된 것을 연산 파이프라인 이라고 하기도 한다.
        myList .stream() // 생성하기
            .filter(s -> s.startsWith("c")) // 가공하기
            .map(String::toUpperCase) // 가공하기
            .sorted() // 가공하기
            .count(); // 결과만들기
    }
}
