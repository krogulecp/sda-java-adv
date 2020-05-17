package info.krogulec.sda.adv.zoo;

public class BlackBear extends Bear{

    public BlackBear() {
        super(50);
    }

    @Override
    public void attack() {
        System.out.println("Black bear is attacking!");
    }
}
