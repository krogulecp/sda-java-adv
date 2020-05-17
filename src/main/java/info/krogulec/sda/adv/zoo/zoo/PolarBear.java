package info.krogulec.sda.adv.zoo.zoo;

import java.time.LocalDate;

public class PolarBear extends Bear{
    public PolarBear(int weight) {
        super(weight);
    }

    @Override
    public void eat() {
        lastEatingDay = LocalDate.now();
    }
}
