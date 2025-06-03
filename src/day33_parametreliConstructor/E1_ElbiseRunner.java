package day33_parametreliConstructor;

public class E1_ElbiseRunner {
    public static void main(String[] args) {

        E1_Elbise elbise1 = new E1_Elbise(1000,"mavi","leopar",140);
        System.out.println("Elbise1 " + elbise1);


        E1_Elbise elbise2 = new E1_Elbise(200,"yeşil","çan",120);
        System.out.println(elbise2);
    }
}
