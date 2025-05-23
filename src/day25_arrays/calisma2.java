package day25_arrays;

public class calisma2 {
    public static void main(String[] args) {


        // verilen int bir array'deki en buyuk elemani yazdirin

        int[] sayilar = {-2,-5,-7,11,-4};
         int enBuyukEleman = sayilar[0];

        for (int i = 0; i < sayilar.length ; i++) {
            if (sayilar[i]> enBuyukEleman){
                enBuyukEleman=sayilar[i];
            }
        }

        System.out.println(" sayılar arrayındeki en büyük eleman: "+ enBuyukEleman);


    }

    // verilen int bir array'deki en buyuk elemani yazdirin

    int[] sayilar = {-2,-5,-7,11,-4};

    public static int getenBuyukEleman (int []arr){
        int enBuyukEleman = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]> enBuyukEleman){
                enBuyukEleman=arr[i];
            }
        }return enBuyukEleman;
    }





}
