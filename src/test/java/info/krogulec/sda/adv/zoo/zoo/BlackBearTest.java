package info.krogulec.sda.adv.zoo.zoo;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BlackBearTest {
    @Test
    void should_gain_weight_aftermeal(){
        //given
        Bear blackBear = new BlackBear(50);
        blackBear.eat();
        //when
        int weight = blackBear.getWeight();
        //then
        assertThat(weight).isEqualTo(51);
    }
}
