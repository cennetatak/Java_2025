package day33_parametreliConstructor;

public class E1_Elbise {


    int fiyat;
    String renk = "renk atanmadı";
    String model = "model atanmadı";
    int uzunluk;

    public E1_Elbise(int fiyat, String renk, String model, int uzunluk) {
        this.fiyat = fiyat;
        this.renk = renk;
        this.model = model;
        this.uzunluk = uzunluk;
    }




    @Override
    public String toString() {
        return "Özellikler :" +
                "fiyat=" + fiyat +
                ", renk='" + renk + '\'' +
                ", model='" + model + '\'' +
                ", uzunluk=" + uzunluk;
    }


}
