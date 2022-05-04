package racingcar.controller;

import java.util.List;

import racingcar.view.InputView;
import racingcar.domain.Car;

public class Race {
    public void startRace() {
        List<Car> cars = InputView.inputCarNames();
    }
}
