package nedelja4.zadatak12;

import java.util.ArrayList;

public class Test {

    public static void setujOstecenja(MotornoVozilo mv) {
        for (Tocak t : mv.getTockovi()) {
            mv.daLiJeOstecen(t);
        }
    }

    public static void main(String[] args) {

        Tocak t1 = new Tocak(130, 500);
        Tocak t2 = new Tocak(170, 400);
        Tocak t3 = new Tocak(10, 4000);



        ArrayList<Tocak> tockoviKamiona = new ArrayList<>();
        tockoviKamiona.add(t1); tockoviKamiona.add(t2); tockoviKamiona.add(t3);

        MotornoVozilo kamion = new Kamion(tockoviKamiona, 80_000, 2007);




        //ovo moram da stavim inace ce tooString ispisivati pogresno.
        // Da li postoji nacin da ne proveravamo svaki tocak zasebno?
        setujOstecenja(kamion);

        System.out.println("Prvobitno stanje kamiona:");
        System.out.println(kamion);

        System.out.println("\nStanje kamiona nakon sto su uklonjeni osteceni tockovi:");
        kamion.removeOstecenu();
        System.out.println(kamion);

        System.out.println("\nStanje kamiona nakon sto su dodati rezervni tockovi: ");
        kamion.ubaciRezervnu();
        System.out.println(kamion);






    }

}
