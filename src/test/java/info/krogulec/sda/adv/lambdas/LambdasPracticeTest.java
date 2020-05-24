package info.krogulec.sda.adv.lambdas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.InstanceOfAssertFactories.MAP;
import static org.junit.jupiter.api.Assertions.*;

class LambdasPracticeTest {

    private LambdasPractice lambdasPractice;

    @BeforeEach
    void before_all_setup(){
        lambdasPractice = new LambdasPractice();
    }

    @Test
    void should_count_all_ints(){
        assertEquals(11, lambdasPractice.countAllInts());
    }

    @Test
    void should_sum_all_ints(){
        assertEquals(66, lambdasPractice.sumAllInts());
    }

    @Test
    void should_get_even_numbers() {
//        List<Integer> expectedInts = List.of(2,4,6,8,10);
        List<Integer> resultInts = lambdasPractice.findAllEvenInts();
        assertThat(resultInts).containsExactlyInAnyOrder(2,4,6,8,10);
    }

    @Test
    void should_sum_even_numbers() {
        assertEquals(30, lambdasPractice.sumAllEvenInts());
    }

    @Test
    void should_have_map_of_names_ant_length_of_each_as_value(){
        Set<String> NAMES = Set.of("Andrzej", "Janusz", "Wojciech", "Michał", "Rafał");
        Map<String, Integer> expectedMap = new HashMap<>();
        for (String entry: NAMES) {
            expectedMap.put(entry, entry.length());
        }
        assertEquals(expectedMap.get("Andrzej"), lambdasPractice.groupLettersInNamesCount().get("Andrzej"));
        assertEquals(expectedMap.get("Janusz"), lambdasPractice.groupLettersInNamesCount().get("Janusz"));
        assertEquals(expectedMap.get("Wojciech"), lambdasPractice.groupLettersInNamesCount().get("Wojciech"));
        assertEquals(expectedMap.get("Michał"), lambdasPractice.groupLettersInNamesCount().get("Michał"));
        assertEquals(expectedMap.get("Rafał"), lambdasPractice.groupLettersInNamesCount().get("Rafał"));
    }

    @Test
    void should_sum_letters_in_all_names() {
        assertEquals(32, lambdasPractice.countLettersInAllNames());
    }

    @Test
    void should_fing_min_value() {
        assertEquals(1, lambdasPractice.findLowestNumer());
    }

    @Test
    void should_return_shortest_name() {
        assertEquals("Rafał", lambdasPractice.findShortestName());
    }

    @Test
    void shoult_get_5_first_ints() {
        assertThat(lambdasPractice.pickFirstFiveElements()).containsExactlyInAnyOrder(1,3,5,7,9);
    }

}