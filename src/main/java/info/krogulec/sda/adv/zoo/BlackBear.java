package info.krogulec.sda.adv.zoo;

public class BlackBear extends Bear{

    public BlackBear(int weight) {
        super(weight);
    }

    @Override
    public void attack() {
        System.out.println("Black bear is attacking!");
    }
}
