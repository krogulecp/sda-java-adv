package info.krogulec.sda.adv.zoo.zoo;

abstract class Animal implements Alive{
    private  int weight;

    @Override
    public boolean isAlive() {
        return false;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
