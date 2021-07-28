package pingfang;

import exception.Division;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class QuadratTest {

    @Test
    void ce(){
        int shu =2;
        int ping = Quadrat.suan(shu);
        assertThat(ping).isEqualTo(4);
    }



}