package info.krogulec.sda.adv.zoo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PolarBearTest {

    @Test
    void should_gain_weight_after_meal() {
        //given
        Bear polarBear = new PolarBear(200); // weight 200
        polarBear.eat();

        //when
        int weight = polarBear.getWeight();

        //then
        assertThat(weight).isEqualTo(203);
    }

}