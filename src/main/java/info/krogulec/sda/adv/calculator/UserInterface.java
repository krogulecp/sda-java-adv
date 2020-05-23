package info.krogulec.sda.adv.calculator;

public interface UserInterface {
    int provideArg();
    Operetion provideOperetion();
    void printResult(double result);
    boolean shouldContinue();
}
