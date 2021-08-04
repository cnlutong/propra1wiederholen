package de.propra.dna.data;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DNATest {

    @Test
    void dna_test_1(){
        DNA dna = new DNA("TTATGCATC");

        assertThat(dna.getDNA(1)).isEqualTo("TTATGCATC");
        assertThat(dna.getDNA(2)).isEqualTo("GATGCATAA");
    }

}