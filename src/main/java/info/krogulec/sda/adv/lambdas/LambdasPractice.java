package info.krogulec.sda.adv.lambdas;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
        return INTS.stream()
                .filter(number -> number%2 == 0)
                .reduce(0, Integer::sum);
    }

    public Map<String, Integer> groupLettersInNamesCount(){
        return NAMES.stream()
                .collect(Collectors.toMap(Function.identity(), name -> name.length()));
    }

    public int countLettersInAllNames(){
        return NAMES.stream()
                .mapToInt(String::length)
                .sum();
    }

    public int findLowestNumer(){
        return INTS.stream()
                .mapToInt(e -> e)
                .min()
                .orElseThrow();
    }

    public String findShortestName(){
        return NAMES.stream()
                .sorted((a,b) -> Integer.valueOf(a.length()).compareTo(Integer.valueOf(a.length())))
                .findFirst()
                .orElseThrow();
    }

    public List<Integer> pickFirstFiveElements(){
        return INTS.stream()
                .limit(5)
                .collect(Collectors.toList());
    }

    public int sumAllNumbersInListOfLists(){
        //TODO zsumować wszystkie elementy w liście INTS_DEEP
        //TODO trzeba użyć metody flatMap
        return 0;
    }
}
