package dznedelja1.domacizadatak2;
import java.util.Scanner;

public class Zadatak2 {

     /*Domaci zadatak 2:
     Napraviti program preko kog cete uneti naziv nekog cveta u konzoli(mogu biti Zumbul, Orhideja,
     Bonzai I Ruze), I program ce vama ispisati naziv I cenu tog cveta.
     Znamo da nam Ruza kosta 50 din.
     Imamo Zumbul koji kosta 20 dinara vise nego Ruze.
     Orhideje kostaju 2.5 puta vise nego Zumbul.
     Bonzai kosta 3 puta vise nego Orhideja.
     Obratiti paznju ukoliko se ne unese ispravan naziv cveta ili nepostojeci cvet.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nazivCveta;
        double cenaRuze = 50;

        System.out.println("Unesite naziv cveta koji zelite da kupite: ");
        nazivCveta = sc.nextLine();

        nazivCveta = nazivCveta.trim();
        nazivCveta = nazivCveta.toUpperCase();

        if (nazivCveta.equals("RUZE")) {
            System.out.println("Imamo Ruze. Cena je " + cenaRuze + " dinara.");
        }
        else if (nazivCveta.equals("ZUMBUL")) {
            System.out.println("Imamo Zumbul. Cena je " + (cenaRuze + 20) + " dinara.");
        }
        else if (nazivCveta.equals("ORHIDEJE")) {
            System.out.println("Imamo Orhideje. Cena je " + (cenaRuze + 20)*3 + " dinara.");
        }
        else if (nazivCveta.equals("BONZAI")) {
            System.out.println("Imamo Bonzai. Cena je " + (cenaRuze + 20)*3*2.5 + " dinara.");
        }
        else {
            System.out.println("Pogresan unos ili nepostojeci cvet na lageru!");
        }

    }

}
