package dznedelja2.domacizadatak5;

import java.util.Scanner;

public class Zadatak1 {

    /*Zadatak 3: Definisati neki niz imena. Uneti ime preko Scannera koje ce vratiti poruku ukoliko se uneto
    ime nalazi u nizu.
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nizImena = {"Jelena", "Vesna", "Nikola", "Jelena", "Miroslav", "Jelena"};

        System.out.print("Unesite ime: ");
        String unetoIme = sc.nextLine();
        int brojPonavljanja = 0;

        for (String clanNiza : nizImena) {
            if (clanNiza.equalsIgnoreCase(unetoIme))
                brojPonavljanja++;
        }
        if (brojPonavljanja == 0)
            System.out.println("Ime " + unetoIme + " ne postoji u nizu!");
        else
            System.out.println("Ime " + unetoIme + " se pojavljuje " + brojPonavljanja + " puta u nizu.");

        System.out.println("\nPostojeca imena u nizu su:");
        for (String imena : nizImena) {
            System.out.println(imena);
        }

    }
}
