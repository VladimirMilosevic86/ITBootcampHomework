package dznedelja1.domacizadatak3;

import java.util.Scanner;

public class Zadatak2 {

    /*Domaci Zadatak 2:
    Napraviti program gde cete uneti pomocu Scanner-a neki broj koji predstavlja novcano stanje firme.
    Zatim uneti broj radnika u toj firmi. Svakom radniku mora biti isplacena plata od 100 din npr. Od
    ukupne svote novca treba oduzeti ukupno para koliko se isplacuje radnicima, i istampati vrednost
    novca koja preostaje firmi (Primer u zadatku uradjen da je plata 100) (Odaberite svoje vrednosti).*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Firma ima din: ");
        int bilansPreIsplate = sc.nextInt();
        System.out.println("Broj zaposlenih u firmi: ");
        int brojZaposlenih = sc.nextInt();
        int plata = 100;
        int bilansPosleIsplate = bilansPreIsplate;
        int neisplaceno = brojZaposlenih;

        for (int i = brojZaposlenih; i > 0 ; i--) {
            if (bilansPreIsplate >= 100) {
                bilansPosleIsplate = bilansPreIsplate - plata;
                bilansPreIsplate -= plata;
                neisplaceno -= 1;
            }
        }
        System.out.println("Kada se isplate plate, firmi preostaje ovoliko para: " + bilansPosleIsplate);
        System.out.println("Broj radnika koji nije dobio platu iznosi: " + neisplaceno);

    }

}
