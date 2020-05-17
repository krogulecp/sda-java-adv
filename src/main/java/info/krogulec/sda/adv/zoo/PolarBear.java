package info.krogulec.sda.adv.zoo;

public class PolarBear extends Bear {
    public PolarBear(int weight) {
        super(weight);
    }

    @Override
    public void attack() {
        System.out.println("Polar bear is attacking!");
    }
}
