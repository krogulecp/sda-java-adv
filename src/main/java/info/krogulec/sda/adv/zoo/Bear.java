package info.krogulec.sda.adv.zoo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public abstract class Bear extends Animal implements Attacker{

    private static final int MAX_ALIVE_DAYS_WITHOUT_EATING = 10;

    public Bear(int weight) {
        super(weight);
    }

    @Override
    public boolean isAlive() {
        int days = Period.between(lastEatingDay, LocalDate.now()).getDays();
        return days <= MAX_ALIVE_DAYS_WITHOUT_EATING;
    }
}
