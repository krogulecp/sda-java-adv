package info.krogulec.sda.adv.zoo;

public class BrownBear extends Bear {

    private static final int GAIN_WEIGHT_RATIO = 2;

    public BrownBear() {
        super(100);
    }

    @Override
    public void attack() {
        System.out.println("Brown bear is attacking and hurts the victim!");
    }

    @Override
    public void display() {
        System.out.println("I am a Brown Bear. My weight is " + getWeight() + " kgs.");
    }

    @Override
    public void eat() {
        super.eat();
        weight += GAIN_WEIGHT_RATIO;
    }
}
