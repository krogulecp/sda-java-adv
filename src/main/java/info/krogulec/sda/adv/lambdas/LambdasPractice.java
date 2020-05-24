package info.krogulec.sda.adv.lambdas;

import javax.print.attribute.standard.MediaSize;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
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
        //Zad: Policzyć wszystkie elementy w liście INTS

        //return INTS.size();

        // warto sprawdzić czy long nie przekroczył inta
        return (int) INTS.stream()
                .count();
    }

    public int sumAllInts(){
        //ZAd: Zsumować wszystkie elementy w liście INTS
        int sum = 0;

//        for (int i : INTS) {
//            sum+= i;
//        }

        sum = INTS.stream()
                // jawny mapping na int
//                .mapToInt(i -> i.intValue()).sum();
                // lub auto unboxing:
                .mapToInt(i -> i).sum();

        //ogólny reduce:
        // reduce to operacja terminalna (kończy operacje na strumieniu, zwraca wartość)
        // są też opearacje pośrednie np. filter()
        sum = 0;
        sum = INTS.stream()
                .reduce(0, (a,b) -> a + b);

        //z referencją do metody (metody sum z klasy Integer
        sum = 0;
        sum = INTS.stream()
                .reduce(0, Integer::sum);


        return sum;
    }

    public List<Integer> findAllEvenInts(){
        //Zad: Znaleźć wszystkie parzyste numery w liście INTS
        return INTS.stream()
                .filter(i -> (i % 2 == 0))
                .collect(Collectors.toList());
    }

    public int sumAllEvenInts(){
        //Zad: Zsumować wszystkie parzyste numery w liście INTS
        return INTS.stream()
                .filter(i -> (i % 2 == 0))
                .reduce(0, Integer::sum);
    }

    public Map<String, Integer> groupLettersInNamesCount(){
        //Zad: Zbudować mapę, gdzie kluczem będzie imię z setu NAMES, a wartością liczba liter w tym imieniu
        return NAMES.stream()
                .collect(Collectors.toMap(name -> name, name -> name.length()));
                // lub z użyciem Function.identity() :
//                .collect(Collectors.toMap(Function.identity(), name -> name.length()));

    }

    public int countLettersInAllNames(){
        //Zad: Zsumować wszystkie litery we wszystkich imionach NAMES
        return NAMES.stream()
//                .mapToInt(name -> name.length())
                .mapToInt(String::length)
                .sum();
    }

    public int findLowestNumer(){
        //Zad: Znaleźć najmniejszą liczbę z NUMBERS
        return INTS.stream()
                .mapToInt(i -> i)
                .min()
                .orElseThrow(RuntimeException::new);
    }

    public String findShortestName(){
        //Zad: Znaleźć najkrótsze imię z setu NAMES
        return NAMES.stream()
                //implementujemy swój komparator, bo nie chcemy sortować po litrach tylko po długości
                .sorted((a,b) -> Integer.valueOf(b.length()).compareTo(Integer.valueOf(b.length())))
                .findFirst()
                .orElseThrow();
    }

    public List<Integer> pickFirstFiveElements(){
        //Zad: Stworzyć listę z pięciu pierwszych elementów w INTS
        return INTS.stream()
                .limit(5)
                .collect(Collectors.toList());
    }

    public int sumAllNumbersInListOfLists(){
        //Zad: zsumować wszystkie elementy w liście INTS_DEEP
        //hint: użyć metody flatMap

        return INTS_DEEP.stream()
                .flatMap(upper -> upper.stream())
                .mapToInt(num -> num)
                .sum();
    }
}
