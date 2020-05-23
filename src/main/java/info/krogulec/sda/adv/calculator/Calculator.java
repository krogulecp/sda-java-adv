package info.krogulec.sda.adv.calculator;

import java.util.Set;

/**
 * @author krogulecp
 */
class Calculator {
    private final int arg1;
    private final int arg2;
    private final Operation operation;
    private final Set<OperationProcessor> operationProcessors;

    public Calculator(int arg1, int arg2, Operation operation, Set<OperationProcessor> operationProcessors) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.operation = operation;
        this.operationProcessors = operationProcessors;
    }

    double calculate(){
        OperationProcessor operationProcessor = provideProcessor();
        return operationProcessor.process(arg1, arg2);
    }

    private OperationProcessor provideProcessor() {
        //TODO Znaleźć odpowiedni procesor z dostarczonego seta
        return null;
    }
}
