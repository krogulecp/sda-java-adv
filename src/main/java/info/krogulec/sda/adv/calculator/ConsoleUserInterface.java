package info.krogulec.sda.adv.calculator;

import java.io.*;
import java.util.Arrays;

/**
 * @author krogulecp
 */
class ConsoleUserInterface implements UserInterface {

    private final BufferedReader in;
    private final PrintStream out;

    public ConsoleUserInterface(InputStream inputStream, PrintStream printStream) {
        this.in = new BufferedReader(new InputStreamReader(inputStream));
        this.out = new PrintStream(printStream);
    }

    @Override
    public int provideArg() {
        out.println("Fill number");
        try {
            return Integer.parseInt(in.readLine());
        } catch (Exception e) {
            throw new InputFormatException("Wprowadzono argument w niepoprawnym formacie");
        }
    }

    @Override
    public Operation provideOperation() {
        out.println("Fill operation. Possible values are: " + Arrays.toString(Operation.values()));
        try {
            return Operation.valueOf(in.readLine());
        } catch (Exception e) {
            throw new InputFormatException("Wprowadzono niepoprawną operację");
        }
    }

    @Override
    public void printResult(double result) {
        out.println("Result is: " + result);
    }

    @Override
    public boolean shouldContinue() {
        //TODO Zaimplementować metodę
        return false;
    }
}
