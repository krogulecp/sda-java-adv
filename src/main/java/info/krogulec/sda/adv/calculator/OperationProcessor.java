package info.krogulec.sda.adv.calculator;

/**
 * @author krogulecp
 */
interface OperationProcessor {
    double process(int a, int b);
    Operation getOperation();
}
