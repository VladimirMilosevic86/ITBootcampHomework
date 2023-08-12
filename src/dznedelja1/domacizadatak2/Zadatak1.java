package dznedelja1.domacizadatak2;
import java.util.Scanner;

public class Zadatak1 {

    /*Domaci Zadatak 1:
    Napisati program koji ce racunati platu za unetu vrednost satnice i broja radnih sati.
    Uneti satnicu i broj radnih sati preko konzole. Ukoliko je ukupna plata negativan broj,
    ispisati neku poruku, u suprotnom samo ispisati ukupnu platu.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double satnica, brojRadnihSati;

        System.out.println("Uneti koliko dinara po satu: ");
        satnica = sc.nextDouble();
        System.out.println("Uneti broj radnih sati: ");
        brojRadnihSati = sc.nextDouble();

        double plata = satnica * brojRadnihSati;

        if (satnica > 0 && brojRadnihSati >0) {
            System.out.println("Satnica je: " + satnica + " dinara");
            System.out.println("Broj radnih sati je: " + brojRadnihSati);
            System.out.println("Vasa plata je: " + plata + " dinara");
        }
        else if (brojRadnihSati == 0 ) {
            System.out.println("Niste radili prethodnog meseca.");
        }
        else {
            System.out.println("Nesipravno uneti podaci! Ukupna plata i/ili satnica ne mogu biti negativni!");
        }

    }
}
