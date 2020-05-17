package info.krogulec.sda.adv.zoo.zoo;

import java.time.Duration;
import java.time.LocalDate;

abstract class Animal implements Alive, Eater{
    private  int weight;
    LocalDate lastEatingDay;

    public Animal(int weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        lastEatingDay = LocalDate.now();
    }

    public int getWeight() {
        return weight;
    }

}
