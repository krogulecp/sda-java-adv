package info.krogulec.sda.adv.calculator;

import java.io.*;
import java.util.Set;
import java.util.stream.Collectors;

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
    public Operation provideOperation(Set<OperationProcessor> operationProcessors) {
        out.println("Fill operation. Possible values are: " + operationProcessors.stream()
        .map(operationProcessor -> operationProcessor.getOperation().name())
        .collect(Collectors.joining(" | ")));
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
        out.println("Czy kontynuować? Możliwe wartości y/n");
        String input = null;
        try {
            input = in.readLine();
        } catch (Exception e) {
            throw new InputFormatException("Wprowadzono niepoprawną wartość");
        }

        boolean ctn = true;
        boolean output = false;

        while(ctn){
            if ("y".equals(input)){
                output = true;
                ctn = false;
            } else if ("n".equals(input)){
                output = false;
                ctn = false;
            } else {
                out.println("Podaj wartość y lub n");
                ctn = true;
            }
        }
        return output;
    }
}
