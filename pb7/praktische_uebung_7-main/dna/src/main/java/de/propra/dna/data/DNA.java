package de.propra.dna.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class DNA {

    ArrayList<NukleotideDNA> dna1;
    ArrayList<NukleotideDNA> dna2;

    Map<String, NukleotideDNA> dna_ordnung =
            Map.of(
                    "A", NukleotideDNA.T,
                    "T", NukleotideDNA.A,
                    "C", NukleotideDNA.G,
                    "G", NukleotideDNA.C
            );

    DNA(String str){
        dna1= new ArrayList<>();
        dna2= new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            dna1.add(NukleotideDNA.valueOf(String.valueOf(str.charAt(i))));
        }
        dna1ToDna2();
    }

    private void dna1ToDna2(){
        for (NukleotideDNA thisdna: dna1) {
            dna2.add(dna_ordnung.get(thisdna.toString()));
        }
        Collections.reverse(dna2);
    }

    public String getDNA(int option){
        ArrayList<NukleotideDNA> thisdna;
        if(option==1){
            thisdna = this.dna1;
        }else {
            thisdna = this.dna2;
        }
        String str="";
        for (NukleotideDNA a: thisdna) {
            str =str.concat(String.valueOf(a));
        }
        System.out.println(str);
        return str;
    }
}
