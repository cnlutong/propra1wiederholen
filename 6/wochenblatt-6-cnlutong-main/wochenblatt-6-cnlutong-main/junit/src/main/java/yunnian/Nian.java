package yunnian;

public class Nian {
    public int year;
    boolean isRun;

    Nian(int year){
        this.year =year;
        this.isRun = false;
    }

    public void re(){
        if(this.year%4==0){
            if(this.year%100==0 && this.year%400!=0){

            }
        this.isRun = true;
        }
    }

}
