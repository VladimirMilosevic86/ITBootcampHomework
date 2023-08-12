package nedelja4.zadatak13;

import java.util.ArrayList;

public class Test {

    public static void setujPenjanje (Planinar planinar){
        for (Planina p  : planinar.getPlanine()){
            planinar.popniSe(p);
        }
    }

    public static void main(String[] args) {


        Planina zlatibor = new Planina("Zaltibor", 1496);
        Planina kopaonik = new Planina("Kopaonik", 2017);
        Planina fruskaGora = new Planina("Fruska Gora ", 539);
        Planina himalaji = new Planina("Himalaji", 8849);

        ArrayList<Planina> listaPlanina = new ArrayList<>();

        Planinar vladimirMilosevic = new Planinar(listaPlanina, 3000, 50.04);
       /* vladimirMilosevic.popniSe(zlatibor);
        vladimirMilosevic.popniSe(kopaonik);
        vladimirMilosevic.popniSe(fruskaGora);
        vladimirMilosevic.popniSe(himalaji);*/

        //ovo sam probao umesto kodova u linijama od 23-27
        //setujPenjanje(vladimirMilosevic); //- ovo ne radi. zasto? mozda je problem konstruktor kako sam napravio listu planine????


        System.out.println(vladimirMilosevic);
        System.out.println("Clanarina iznosi: " + vladimirMilosevic.clanarina());
        System.out.println("Visina svih uspona iznosi: " + vladimirMilosevic.sviUsponi());
        System.out.println("Najvisa planina na koju se popeo je: " + vladimirMilosevic.najvisaPlanina());

    }



}
