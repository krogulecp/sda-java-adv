package info.krogulec.sda.adv.lambdas;

import java.util.List;
import java.util.Map;
import java.util.Set;

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
        //TODO Policzyć wszystkie elementy w liście INTS
        return 0;
    }

    public int sumAllInts(){
        //TODO Zsumować wszystkie elementy w liście INTS
        return 0;
    }

    public List<Integer> findAllEvenInts(){
        //TODO Znaleźć wszystkie parzyste numery w liście INTS
        return null;
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
