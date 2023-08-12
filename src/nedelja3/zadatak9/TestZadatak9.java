package nedelja3.zadatak9;

import java.util.ArrayList;

public class TestZadatak9 {

    public static void main(String[] args) {

        Departman geografija = new Departman("Geografija", 120, 15);
        System.out.println(geografija);
        System.out.println("---------------------------------------------------------------------------------");
        Departman demografija = new Departman("Demografija", 50, -5);
        System.out.println(demografija);
        System.out.println("---------------------------------------------------------------------------------");
        Departman turizam = new Departman("Turizam", -75, 17);
        System.out.println(turizam);

        System.out.println("=================================================================================");

        Departman bilogija = new Departman("Biologija", 40, 10);
        System.out.println(bilogija);
        Departman matematika = new Departman("Matematika", 12, 21);
        System.out.println(matematika);


        ArrayList<Departman> listaDepartmanaNaPMF = new ArrayList<>(); //deklarise listu tipa Departman (objekat)
        listaDepartmanaNaPMF.add(bilogija); //dodaje departman biologija
        listaDepartmanaNaPMF.add(matematika); //doaje departman matematika
        Fakultet pmf1 = new Fakultet("PMF", listaDepartmanaNaPMF); // deklarise i inicijalizuje objekat pmf1 tipa Fakultet (prosledjuje naziv i listu koja sadrzi objekte tipa Departman
        System.out.println("Ukupan broj ucenika na PMF-u:" + pmf1.ukupanBrojUcenika()); //ispisuje ukupan broj ucenika na svim departmanima u okviru objekta pmf1
        pmf1.dodajPredmeteNaDepartman(); // dodaje predmete objektima tipa Departman, koji se nalaze u okviru liste ListaDepartmanaNaPMF koja je argument objekta pmf1
        System.out.println(pmf1); //ispisuje objekat pmf1


    }
}
