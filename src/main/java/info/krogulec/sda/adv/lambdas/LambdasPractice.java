package info.krogulec.sda.adv.lambdas;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Do wszystkich zadań piszemy najpierw odpowiedni test
 *
 * @author krogulecp
 */
class LambdasPractice {

    public static final List<Integer> INTS = List.of(1,3,5,7,9,11,2,4,6,8,10);
    public static final Set<String> NAMES = Set.of("Andrzej", "Janusz", "Wojciech", "Michał", "Rafał");
    public static final List<List<Integer>> INTS_DEEP = List.of(List.of(1,2,3), List.of(4,5,6), List.of(7,8,9));

    public int countAllInts(){
        //Warto sprawdzić, czy nie będzie przekroczona wartość maksymalna inta i obsłużyć tę sytuację
        long count = INTS.stream()
                .count();

        if (count >= Integer.MAX_VALUE){
            throw new RuntimeException("Too large number");
        } else {
            return (int) count;
        }
    }

    public int sumAllInts(){

        int sumVer1 = INTS.stream()
                .mapToInt(e -> e)
                .sum();

        Integer sumVer2 = INTS.stream()
                .reduce(0, Integer::sum);

        return INTS.stream()
                .reduce(0, (a, b) -> a + b);
    }

    public List<Integer> findAllEvenInts(){
        return INTS.stream()
                .filter(number -> number%2 == 0)
                .collect(Collectors.toList());
    }

    public int sumAllEvenInts(){
        //TODO Zsumować wszystkie parzyste numery w liście INTS
        return 0;
    }

    public Map<String, Integer> groupLettersInNamesCount(){
        //TODO Zbudować mapę, gdzie kluczem będzie imię z setu NAMES, a wartością liczba liter w tym imieniu
        return null;
    }

    public int countLettersInAllNames(){
        //TODO Zsumować wszystkie litery we wszystkich imionach NAMES
        return 0;
    }

    public int findLowestNumer(){
        //TODO Znaleźć najmniejszą liczbę z NUMBERS
        return 0;
    }

    public String findShortestName(){
        //TODO Znaleźć najkrótsze imię z setu NAMES
        return null;
    }

    public List<Integer> pickFirstFiveElements(){
        //TODO Stworzyć listę z pięciu pierwszych elementów w INTS
        return null;
    }

    public int sumAllNumbersInListOfLists(){
        //TODO zsumować wszystkie elementy w liście INTS_DEEP
        return 0;
    }
}
