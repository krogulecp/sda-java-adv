package info.krogulec.sda.adv.zoo;

import java.time.Duration;
import java.time.LocalDate;

public abstract class Animal implements Alive, Eater{

    protected int weight;
    LocalDate lastEatingDay;


    public Animal(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public void eat() {
        lastEatingDay = LocalDate.now();
    }
}
