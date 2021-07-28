package yunnian;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.condition.OS.LINUX;
import static org.junit.jupiter.api.condition.OS.MAC;

class NianTest {

    @Test
    void te1(){
        Nian nian = new Nian(2020);
        nian.re();
        assertThat(nian.isRun).isEqualTo(true);

        var number = assertThat(4);
        var string = assertThat("foo");
        var bool = assertThat(false);
        var ldt = assertThat(LocalDate.now());
        var collection = assertThat(List.of(1,2,3));
    }

    @Test
    @EnabledOnOs({LINUX, MAC})
    void test_os() {
        fail("This OS sucks!");
    }



}