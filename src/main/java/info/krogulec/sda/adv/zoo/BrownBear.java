package info.krogulec.sda.adv.zoo;

public class BrownBear extends Bear {

    public BrownBear() {
        super(100);
    }

    @Override
    public void attack() {
        System.out.println("Brown bear is attacking!");
    }
}
