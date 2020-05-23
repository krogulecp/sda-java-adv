package info.krogulec.sda.adv.calculator;

/**
 * @author krogulecp
 */
interface UserInterface {

    int provideArg();
    Operation provideOperation();
    void printResult(double result);
    boolean shouldContinue();
}
