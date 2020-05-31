package info.krogulec.sda.adv.calculator;

import org.reflections.Reflections;

import java.lang.Class;
import java.util.HashSet;
import java.util.Set;

/**
 * @author krogulecp
 * +JB
 */
class ProcessorsProvider {
    Set<OperationProcessor> provide(){
        // Znaleźć w kontekście aplikacji wszystkie implementacje interfejsu OperationProcessor, stworzyć obiekty, zebrać je do Set<...> i zwrócić
        // Można wykorzystać bibliotekę Reflections
        // Zrobione ~JB
        Reflections reflections = new Reflections("info.krogulec.sda.adv.calculator");

        Set<Class<? extends OperationProcessor>> opProcImplementations = reflections.getSubTypesOf(OperationProcessor.class);

        Set<OperationProcessor> operationProcessors = new HashSet<>();
        opProcImplementations
                .forEach(c -> {
                    try {
                        operationProcessors.add(c.getDeclaredConstructor().newInstance());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
        return operationProcessors;
    }
}
