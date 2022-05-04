package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.domain.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputView {
    /*
    왜 자바에서 final 멤버 변수는 관례적으로 static을 붙일까?
    https://djkeh.github.io/articles/Why-should-final-member-variables-be-conventionally-static-in-Java-kor/
    https://zorba91.tistory.com/275
    */
    private static final String NAME_DELIMITER = ",";

    /*
    자바 지네릭의 기초
    https://tecoble.techcourse.co.kr/post/2020-11-09-generics-basic/
     */
    public static List<Car> inputCarNames(){
        OutputView.printInputCarNames();

        // 스트림에 대해서 추후에 공부해보자.... (아직은 이르다)
        try{
            String input = Console.readLine();
            return Arrays.stream(input.split(NAME_DELIMITER))
                    .map(Car::new)
                    .collect(Collectors.toList());
        } catch (IllegalArgumentException e) {
            OutputView.printErrorMessage(e.getMessage());
            return inputCarNames();
        }
    }

}
