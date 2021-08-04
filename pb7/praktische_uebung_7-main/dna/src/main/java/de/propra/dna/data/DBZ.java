package de.propra.dna.data;

import java.util.ArrayList;
import java.util.Map;

public class DBZ {

    String dbz1;
    String dbz2;
    Map<String, Character> dbz_ordnung;

    DBZ(RNA rna){
        this.dbz1=rNAToDBR(rna.rna1);
    }

    private void instidOrdung(){
        for (Codon thisCodon: Codon.values()) {
            dbz_ordnung.put(thisCodon.toString(), thisCodon.getPeptid().getPeptideCode());
        }
    }

    private String rNAToDBR(ArrayList<NukleotideRNA> rna){
        Boolean isStart = false;
        Boolean isEnd = false;
        String output = "";
        for (int i = 0; i < rna.size()-2 && isEnd==false; i++) {
            String str="";
            str= rna.get(i).toString().concat(rna.get(i+1).toString()).concat(rna.get(i+2).toString());
            //System.out.println(str);
            if(!isStart){
                if(str.equals("AUG")){
                    isStart=true;
                }
            }
            else if(isStart && !isEnd){
                output=output + dbz_ordnung.get(str);
                i=i+2;
            }
            else if(isStart && !isEnd){
                output=output + dbz_ordnung.get(str);
                i=i+2;
            }


        }
        return null;
    }



}
