package info.krogulec.sda.adv.zoo;

public class BrownBear extends Bear {

    public BrownBear(int weight) {
        super(weight);
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public void attack() {
        System.out.println("Brown bear is attacking!");
    }
}
