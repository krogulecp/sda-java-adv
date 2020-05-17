package info.krogulec.sda.adv.zoo.zoo;

public class BlackBear extends Bear{
    private static final int GAIN_WEIGHT_MEAL_VALUE = 1;

    public BlackBear(int weight) {
        super(weight);
    }

    @Override
    public void eat() {
        super.eat();
        weight += GAIN_WEIGHT_MEAL_VALUE;
    }
}
