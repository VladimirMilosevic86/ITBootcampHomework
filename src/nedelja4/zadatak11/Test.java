package nedelja4.zadatak11;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        Sportista s1 = new Sportista("Marko", "Tomin", 80_000.00);
        Sportista s2 = new Sportista("Strahinja", "Trninic", 50_000.00);
        Sportista s3 = new Sportista("Andjela", "Relic", 34_000.00);
        Sportista s4 = new Sportista("Nikola", "Sarac", 56_000.00);
        Sportista s5 = new Sportista("Milos", "Knezevic", 61_000.00);
        Sportista s6 = new Sportista("Ana", "Tomasevic", 78_000.00);
        Sportista s7 = new Sportista("Jovana", "Jezdovic", 47_000.00);
        Sportista s8 = new Sportista("Andjelija", "Markovic", 71_000.00);
        Sportista s9 = new Sportista("Stefan", "Milikic", 68_000.00);
        Sportista s10 = new Sportista("Andrija", "Sarenac", 52_000.00);
        Sportista s11 = new Sportista("Saska", "Ilic", 63_000.00);

        ArrayList<Sportista> mancesterClanoviKluba = new ArrayList<>();
        mancesterClanoviKluba.add(s1);
        mancesterClanoviKluba.add(s2);
        mancesterClanoviKluba.add(s3);
        mancesterClanoviKluba.add(s4);
        mancesterClanoviKluba.add(s5);
        mancesterClanoviKluba.add(s6);
        mancesterClanoviKluba.add(s7);
        mancesterClanoviKluba.add(s8);
        mancesterClanoviKluba.add(s9);
        mancesterClanoviKluba.add(s10);
        mancesterClanoviKluba.add(s11);

        Mancester mancester = new Mancester(mancesterClanoviKluba, "Mancester", 3_000_000.00);
        System.out.println(mancester);

        double budzetKlubaNakonIsplate = mancester.isplati();
        System.out.println("Budzet kluba nakon isplate: " + budzetKlubaNakonIsplate);

        double prosecnaPlateIgraca = mancester.prosecnoPlaceni();
        System.out.println("Prosecna plata igraca je: " + prosecnaPlateIgraca);

        System.out.println("-------------------------------------------------------------------------------");

        mancester.removePreplaceni();
        System.out.println("Preostali clanovi nakon sto su preplaceni uklonjeni: ");
        System.out.println(mancester);








    }
}
