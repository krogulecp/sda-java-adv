package info.krogulec.sda.adv.zoo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {


    @Test
    void isAlive() {
        //given
        Animal polarBear = new PolarBear();
        polarBear.eat();
        //when
        boolean alive = polarBear.isAlive();

        //then
        assertThat(alive).isTrue();
    }

    @Test
    void border_case_10_days_after_feeding() {
        //given
        Animal polarBear = new PolarBear();
        polarBear.lastEatingDay = LocalDate.now().minusDays(10);
        //when
        boolean alive = polarBear.isAlive();

        //then
        assertThat(alive).isTrue();
    }

    @Test
    void border_case_11_days_after_feeding() {
        //given
        Animal polarBear = new PolarBear();
        polarBear.lastEatingDay = LocalDate.now().minusDays(11);
        //when
        boolean alive = polarBear.isAlive();

        //then
        assertThat(alive).isFalse();
    }
}