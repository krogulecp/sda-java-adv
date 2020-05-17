package info.krogulec.sda.adv.zoo;

public class PolarBear extends Bear {
    public PolarBear() {
        super(200);
    }

    @Override
    public void attack() {
        System.out.println("Polar bear is attacking!");
    }
}
