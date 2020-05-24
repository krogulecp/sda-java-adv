package info.krogulec.sda.adv.lambdas;

import org.junit.jupiter.api.Test;

import java.util.List;

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
}