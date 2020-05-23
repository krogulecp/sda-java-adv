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
        //TODO Zaimplementować metodę
    }
}
