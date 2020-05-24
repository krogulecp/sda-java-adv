package info.krogulec.sda.adv.lambdas;

import org.junit.jupiter.api.Test;

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
}