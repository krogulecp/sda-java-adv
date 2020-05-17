package info.krogulec.sda.adv.zoo.zoo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BrownBearTest {
    @Test
    void should_gain_weight_aftermeal(){
        //given
        Bear brownBear = new BrownBear(100);
        brownBear.eat();
        //when
        int weight = brownBear.getWeight();
        //then
        assertThat(weight).isEqualTo(102);
    }
}
