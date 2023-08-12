package dznedelja2.domacizadatak6;
import java.util.Scanner;

/* a) Napraviti funkciju za ubacivanje celih brojeva u niz. U parametru metoda cemo imati broj koji predstavlja
    velicinu niza, unutar funkcije cemo ubacivati elemente u niz i vratiti konacan niz.*/

//b) Proci kroz zadati niz iz primera a) i svaki neparan broj pretvoriti u parni.

public class Zadatak1 {

    //Zadatak 1 a)
    static int[] kreirajNiz (int duzinaNiza){
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi " + duzinaNiza + " elemenata niza: ");
        int[] niz = new int[duzinaNiza];
        for (int i = 0; i < niz.length; i++) {
            niz[i] = sc.nextInt();
        }
        return niz;
    }

    static void ispisiNiz(int[] niz){
        for (int i : niz) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    //Zadatak 1 b)
    static boolean daLiJeParan(int x){
        if (x % 2 != 0)
            return false;
        return true;
    }

    static void pretvaraNeparneUParne(int[] niz){
        for (int i = 0; i < niz.length; i++) {
            if (!daLiJeParan(niz[i]))
                niz[i]++;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi duzinu niza: ");
        int duzinaNiza = sc.nextInt();

        int[] niz = kreirajNiz(duzinaNiza); //Kreira niz pomocu methode

        System.out.print("Niz koji ste uneli je: ");
        ispisiNiz(niz); //Ispisuje niz pomocu metode

        pretvaraNeparneUParne(niz); //Metod pretvara neparne elemente niza u parne
        System.out.print("Novi niz bez neparnih brojeva: ");
        ispisiNiz(niz);

    }
}
