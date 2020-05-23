package info.krogulec.sda.adv.calculator;

import java.util.Set;

/**
 * @author krogulecp
 */
class Main {
    public static void main(String[] args) {
        //można również zrobić klasę znajdującą wszystkie implementacje interfejsu OpperationProcessor i je tutaj dostarczyć*
        new Program(Set.of(new AdditionProcessor(), new SubtracionProcessor(), new MultiplicationProcessor(), new DivisionProcessor()),
                new ConsoleUserInterface(System.in, System.out)).run();
    }
}
