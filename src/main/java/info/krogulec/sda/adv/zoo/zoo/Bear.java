package info.krogulec.sda.adv.zoo.zoo;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public abstract class Bear extends Animal{
    private  final int Max_Alive_Days_Without_Eating = 10;

    public Bear(int weight) {
        super(weight);
    }

    @Override
    public boolean isAlive() {
        int days = Period.between(lastEatingDay, LocalDate.now()).getDays();
        return  days <= Max_Alive_Days_Without_Eating;
    }


}
