package info.krogulec.sda.adv.zoo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author krogulecp
 */
class BrownBearTest {

    @Test
    void should_gain_weight_after_meal(){
        //given
        Bear brownBear = new BrownBear(100);
        brownBear.eat();

        //when
        int weight = brownBear.getWeight();

        //then
        assertThat(weight).isEqualTo(102);
    }

}