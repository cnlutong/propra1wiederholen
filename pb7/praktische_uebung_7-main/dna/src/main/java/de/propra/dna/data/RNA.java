package de.propra.dna.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class RNA {

    ArrayList<NukleotideRNA> rna1;
    ArrayList<NukleotideRNA> rna2;

    Map<NukleotideDNA, NukleotideRNA> rna_ordnung=
            Map.of(
                    NukleotideDNA.A, NukleotideRNA.U,
                    NukleotideDNA.T, NukleotideRNA.A,
                    NukleotideDNA.C, NukleotideRNA.G,
                    NukleotideDNA.G, NukleotideRNA.C
            );

    RNA(DNA dna){

        this.rna1=dNAToRNA(dna.dna1);
        Collections.reverse(rna1);
        this.rna2=dNAToRNA(dna.dna2);
        Collections.reverse(rna2);
    }

    private ArrayList<NukleotideRNA> dNAToRNA(ArrayList<NukleotideDNA> dna){
        ArrayList<NukleotideRNA> rna = new ArrayList<>();
        for (NukleotideDNA thiddna: dna) {
            rna.add(rna_ordnung.get(thiddna));
        }
        return rna;
    }

    public String getRNA(int option){
        ArrayList<NukleotideRNA> thisrna;
        if(option==1){
            thisrna = this.rna1;
        }else {
            thisrna = this.rna2;
        }
        String str="";
        for (NukleotideRNA a: thisrna) {
            str =str.concat(String.valueOf(a));
        }
        return str;
    }



}
