package info.krogulec.sda.adv.calculator;

/**
 * @author krogulecp
 */
class MultiplicationProcessor implements OperationProcessor{
    @Override
    public double process(int a, int b) {
        return a * b;
    }

    @Override
    public Operation getOperation() {
        return Operation.MULTIPLY;
    }
}
