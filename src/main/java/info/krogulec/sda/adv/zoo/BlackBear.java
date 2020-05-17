package info.krogulec.sda.adv.zoo;

public class BlackBear extends Bear{

    private static final int GAIN_WEIGHT_RATIO = 1;

    public BlackBear() {
        super(50);
    }

    @Override
    public void attack() {
        System.out.println("Black bear is attacking and hurts the victim!");
    }

//    @Override
//    public void display() {
//        System.out.println("I am a Black Bear. My weight is " + getWeight() + " kgs.");
//    }

    @Override
    public void eat() {
        super.eat();
        weight += GAIN_WEIGHT_RATIO;
    }
}
