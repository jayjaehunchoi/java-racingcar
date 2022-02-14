package racingcar;

import racingcar.controller.RacingController;
import racingcar.utils.RandomNumberGenerator;

public class RacingMain {

    public static void main(String[] args) {
        RacingController racingController = new RacingController();
        racingController.play(new RandomNumberGenerator());
    }
}
