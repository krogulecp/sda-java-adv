package info.krogulec.sda.adv.zoo.zoo;

import java.time.LocalDate;

public class PolarBear extends Bear{
    private static final int GAIN_WEIGHT_MEAL_VALUE = 3;
    public PolarBear(int weight) {
        super(weight);
    }

    @Override
    public void eat() {
        lastEatingDay = LocalDate.now();
    }
}
