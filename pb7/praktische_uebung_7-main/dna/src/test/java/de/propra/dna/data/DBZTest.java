package de.propra.dna.data;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class DBZTest {

    @Test
    void dbz_test_1(){
        DNA dna = new DNA("TTATGCATC");
        RNA rna = new RNA(dna);
        DBZ dbz = new DBZ(rna);

       // assertThat(dbz.get)
    }

}