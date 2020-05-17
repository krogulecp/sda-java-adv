package info.krogulec.sda.adv.zoo;

public abstract class Animal implements Alive{

    //private String name;
    private int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
