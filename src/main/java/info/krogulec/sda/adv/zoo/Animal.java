package info.krogulec.sda.adv.zoo;

import java.time.Duration;
import java.time.LocalDate;

public abstract class Animal implements Alive, Eater{

    private final int MAX_ALIVE_DAYS_WITHOUT_EATING = 10;

    private int weight;
    LocalDate lastEatingDay;


    public Animal(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean isAlive() {
        return Duration.between(LocalDate.now(), lastEatingDay).toDays() < MAX_ALIVE_DAYS_WITHOUT_EATING ;
    }

    @Override
    public void eat() {
        lastEatingDay = LocalDate.now();
    }
}
