package info.krogulec.sda.adv.zoo.zoo;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class AnimalTest {

    @Test
    void isAlive(){
        //given
         Animal polarBear = new PolarBear(123);
         polarBear.eat();
        //when
        boolean alive = polarBear.isAlive();
        //then
        assertThat(alive).isTrue();
    }

    @Test
    void should_return_alive_with_ten_days_since_last_meal(){
        //given
        Animal polarBear = new PolarBear(123);
        polarBear.lastEatingDay = LocalDate.now().minusDays(10);
        //when
        boolean alive = polarBear.isAlive();
        //then
        assertThat(alive).isTrue();
    }

    @Test
    void should_return_not_alive_with_eleven_days_since_last_meal(){
        //given
        Animal polarBear = new PolarBear(123);
        polarBear.lastEatingDay = LocalDate.now().minusDays(11);

        //when
        boolean alive = polarBear.isAlive();

        //then
        assertThat(alive).isFalse();
    }

    @Test
    void should_return_wrong_weight(){
        //given
        Animal polarBear = new PolarBear(123);

        //when

        //then
    }
}
