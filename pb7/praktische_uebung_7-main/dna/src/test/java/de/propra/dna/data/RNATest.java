package de.propra.dna.data;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RNATest {

    @Test
    void rna_test_1(){
        DNA dna = new DNA("TTATGCATC");
        RNA rna = new RNA(dna);

        assertThat(rna.getRNA(1)).isEqualTo("GAUGCAUAA");
        assertThat(rna.getRNA(2)).isEqualTo("UUAUGCAUC");
    }

}