package nedelja3.zadatak10;

public class TestZadatak10 {

    public static void main(String[] args) {

        Fizikalac fizikalac = new Fizikalac("Marko", "Tomin", 45, 500.00);
        Masinovodja masinovodja = new Masinovodja("Strahnja", "Trninic", 20, 1000.00);
        SefSmene sef = new SefSmene("Amanda", "Dimitrijevic Zecevic", 10, 3000.00, 5000.00);

        System.out.println(fizikalac);
        fizikalac.daLiJeNaOdmoru();
        System.out.println(masinovodja);
        masinovodja.daLiJeNaOdmoru();
        System.out.println(sef);
        sef.daLiJeNaOdmoru();
        System.out.println("Ukupno su zaradili: " + (fizikalac.ukupnaZarada() + masinovodja.ukupnaZarada() + sef.ukupnaZarada()));





    }
}
