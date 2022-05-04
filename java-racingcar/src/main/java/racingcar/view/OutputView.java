package racingcar.view;

public class OutputView {
    private static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요. (이름은 쉼표(,) 기분으로 구분됩니다";

    public static void printInputCarNames(){
        System.out.println(INPUT_CAR_NAMES_MESSAGE);
    }

    public static void printErrorMessage(String errMsg){
        System.out.println("[ERROR]" + errMsg);
    }
}
