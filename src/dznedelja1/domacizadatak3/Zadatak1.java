package dznedelja1.domacizadatak3;

import java.util.Scanner;

public class Zadatak1 {

    /*Domaci Zadatak 1:
    Napraviti program koji ce Vam omoguciti da unosite neke Stringove sve dok ne napisete "stop".
    Nakon sto napisete "stop", program treba da ispise sve Stringove koje ste do tada uneli.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite String: ");
        String unos = sc.nextLine();
        String ispis = "";

        while (!unos.equalsIgnoreCase("stop")) {
            ispis += unos + ' ';
            unos = sc.nextLine();
        }
        System.out.println(ispis);

    }

}
