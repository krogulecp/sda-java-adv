package info.krogulec.sda.adv.zoo;

/**
 * @author krogulecp
 */
abstract class Animal implements Alive {

    private int weight;

    public Animal(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    public int getWeight() {
        return weight;
    }
}
