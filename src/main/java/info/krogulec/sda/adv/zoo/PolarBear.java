package info.krogulec.sda.adv.zoo;

public class PolarBear extends Bear {

    private static final int GAIN_WEIGHT_RATIO = 3;

    public PolarBear() {
        super(200);
    }

    @Override
    public void attack() {
        System.out.println("Polar bear is attacking and killing!");
    }

    @Override
    public void display() {
        System.out.println("I am a Polar Bear. My weight is " + getWeight() + " kgs.");
    }

    @Override
    public void eat() {
        super.eat();
        weight += GAIN_WEIGHT_RATIO;
    }
}
