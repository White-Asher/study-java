package post1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import java.util.stream.Stream;

public class streamAPI1 {
    public static void main(String[] args) {
        String[] nameArr = {"IronMan", "Captain", "Hulk", "Thor"};
        List<String> nameList = Arrays.asList(nameArr);

//        # Stream API를 사용하지 않은 경우
//        Arrays.sort(nameArr);
//        Collections.sort(nameList);
//
//        for (String str: nameArr) {
//            System.out.println(str);
//        }
//
//        for (String str : nameList) {
//            System.out.println(str);
//        }

        // 원본의 데이터가 아닌 별도의 Stream을 생성함
        Stream<String> nameStream = nameList.stream();
        Stream<String> arrayStream = Arrays.stream(nameArr);

        // 복사된 데이터를 정렬하여 출력함
        nameStream.sorted().forEach(System.out::println);
        arrayStream.sorted().forEach(System.out::println);





    }
}
