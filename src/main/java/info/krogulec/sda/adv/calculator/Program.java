package info.krogulec.sda.adv.calculator;

import java.util.Set;

public class Program {
    private  final  Set<OperetionProcessor> operetionProcessors;
    private final UserInterface userInterface;

    public Program(Set<OperetionProcessor> operetionProcessors) {
        this.operetionProcessors = operetionProcessors;
        this.userInterface = new ConsoleUserInterface();
    }

    public void run() {

    }
}
