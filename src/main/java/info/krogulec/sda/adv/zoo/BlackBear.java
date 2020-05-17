package info.krogulec.sda.adv.zoo;

public class BlackBear extends Bear{

    private static final int GAIN_WEIGHT_AFTER_MEAL_VALUE = 1;

    public BlackBear(int weight) {
        super(weight);
    }

    @Override
    public void attack() {
        System.out.println("Black bear is attacking!");
    }

    @Override
    public void eat() {
        super.eat();
        weight += GAIN_WEIGHT_AFTER_MEAL_VALUE;
    }
}
