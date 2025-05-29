package day32_constructors;

public class Elbise {


    int fiyat;
    String renk = "renk atanmadı";
    String model = "model atanmadı";
    int uzunluk;

    Elbise(int fyt,String rnk, String mdl,int uzn){
        fiyat = fyt;
        renk=rnk;
        model=mdl;
        uzunluk =uzn;
    }

    Elbise (){
    }
    @Override
    public String toString() {
        return "Elbise{" +
                "fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", uzunluk=" + uzunluk +
                '}';
    }
}
