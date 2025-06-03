package day33_parametreliConstructor;


    public class CarOrnek {

        int fiyat = 50;



        public CarOrnek(int fiyat) {

            this.fiyat = fiyat;

        }



        public static void main(String[] args) {

            CarOrnek c1 = new CarOrnek(50);

            System.out.println(c1);

        }


    }

