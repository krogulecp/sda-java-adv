package info.krogulec.sda.adv.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author krogulecp
 */
class ConsoleUserInterface implements UserInterface {

    private final BufferedReader in;
    private final PrintStream out;

    public ConsoleUserInterface() {
        this.in = new BufferedReader(new InputStreamReader(System.in));
        this.out = new PrintStream(System.out);
    }

    @Override
    public int provideArg() {
        return 0;
    }

    @Override
    public Operation provideOperation() {
        return null;
    }

    @Override
    public void printResult(double result) {

    }

    @Override
    public boolean shouldContinue() {
        return false;
    }
}
