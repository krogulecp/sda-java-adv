package info.krogulec.sda.adv.lambdas;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author krogulecp
 */
class LambdasPracticeTest {

    @Test
    void should_count_all_ints(){
        assertEquals(11, new LambdasPractice().countAllInts());
    }

    @Test
    void should_sum_all_ints(){
        assertEquals(66, new LambdasPractice().sumAllInts());
    }

    @Test
    void should_get_even_numbers(){
        List<Integer> result = new LambdasPractice().findAllEvenInts();
        assertThat(result).containsExactlyInAnyOrder(2, 4, 6, 8, 10);
    }

    @Test
    void should_sum_all_even_numbers(){
        assertEquals(30, new LambdasPractice().sumAllEvenInts());
    }

    @Test
    void should_create_map_with_letter_count_in_names(){
        Map<String, Integer> namesLetterCount = new LambdasPractice().groupLettersInNamesCount();
        assertThat(namesLetterCount.get("Andrzej")).isEqualTo(7);
        assertThat(namesLetterCount.get("Janusz")).isEqualTo(6);
        assertThat(namesLetterCount.get("Wojciech")).isEqualTo(8);
        assertThat(namesLetterCount.get("Michał")).isEqualTo(6);
        assertThat(namesLetterCount.get("Rafał")).isEqualTo(5);
    }

    @Test
    void should_return_sum_of_all_letters_in_names(){
        assertEquals(32, new LambdasPractice().countLettersInAllNames());
    }

    @Test
    void should_find_min_value(){
        assertEquals(1, new LambdasPractice().findLowestNumer());
    }

    @Test
    void should_find_shortest_name(){
       assertEquals("Rafał", new LambdasPractice().findShortestName());
    }

    @Test
    void should_pick_first_five_elements(){
        List<Integer> expectedResult = new LambdasPractice().pickFirstFiveElements();
        assertThat(expectedResult).containsExactlyInAnyOrder(1,3,5,7,9);
    }
}