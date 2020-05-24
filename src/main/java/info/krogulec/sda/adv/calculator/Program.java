package info.krogulec.sda.adv.calculator;

import java.util.Set;

/**
 * @author krogulecp
 */
class Program {

    private final Set<OperationProcessor> operationProcessors;
    private final UserInterface userInterface;

    public Program(Set<OperationProcessor> operationProcessors, UserInterface userInterface) {
        this.operationProcessors = operationProcessors;
        this.userInterface = userInterface;
    }

    public void run() {
        do {
            int arg1 = userInterface.provideArg();
            int arg2 = userInterface.provideArg();
            Operation operation = userInterface.provideOperation(operationProcessors);
            double result = new Calculator(arg1, arg2, operation, operationProcessors).calculate();
            userInterface.printResult(result);
        } while (userInterface.shouldContinue());
    }
}
