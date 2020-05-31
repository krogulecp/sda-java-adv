package info.krogulec.sda.adv.calculator;

import java.util.Set;

/**
 * @author krogulecp
 */
class Main {
    public static void main(String[] args) {
        //można również zrobić klasę znajdującą wszystkie implementacje interfejsu OpperationProcessor i je tutaj dostarczyć*
        //TODO tutaj wykorzystać klasę ProcessorsProvider
//        new Program(Set.of(new SubtracionProcessor(), new MultiplicationProcessor(), new DivisionProcessor()),
//                new ConsoleUserInterface(System.in, System.out)).run();
        ProcessorsProvider processorsProvider = new ProcessorsProvider();
        new Program(processorsProvider.provide(),
                new ConsoleUserInterface(System.in, System.out)).run();
    }
}
