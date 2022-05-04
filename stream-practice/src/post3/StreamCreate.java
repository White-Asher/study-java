package post3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreate {
    public static void main(String[] args) {
        // List로부터 스트림을 생성
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> listStream = list.stream();

        // 배열로부터 스트림을 생성
        Stream<String> stream1 = Stream.of("a", "b", "c"); //가변인자
        Stream<String> stream2 = Stream.of(new String[] {"a", "b", "c"});
        Stream<String> stream3 = Arrays.stream(new String[] {"a", "b", "c"});
        Stream<String> stream4 = Arrays.stream(new String[] {"a", "b", "c"}, 0, 3); //end범위 포함 x

        // 4이상 10 이하의 숫자를 갖는 IntStream
        IntStream stream = IntStream.range(4, 10);



    }
}
