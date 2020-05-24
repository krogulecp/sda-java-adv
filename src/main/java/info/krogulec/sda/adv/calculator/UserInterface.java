package info.krogulec.sda.adv.calculator;

import java.util.Set;

/**
 * @author krogulecp
 */
interface UserInterface {

    int provideArg();
    Operation provideOperation(Set<OperationProcessor> operationProcessors);
    void printResult(double result);
    boolean shouldContinue();
}
