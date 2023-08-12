package dznedelja1.domacizadatak4;

public class Zadatak2 {

    /*
     * Domaci Zadatak 2:
     * Definisati neki niz brojeva. Zatim:
     * a) Svaki parni broj u nizu povecati za 1
     * b) Svaki broj na parnoj poziciji povecati za 2
    */

    public static void main(String[] args) {

        System.out.println("a) Svaki parni broj u nizu povecati za 1:\n");
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] % 2 == 0) {
                niz1[i]+=1;
            }
            System.out.println(niz1[i]);
        }

        System.out.println("\n----------------------\n");

        System.out.println("b) Svaki broj na parnoj poziciji povecati za 2:\n");
        int[] niz2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int j = 0; j < niz2.length; j++) {
            if (j % 2 == 0) {
                niz2[j]+=2;
            }
            System.out.println(niz2[j]);
        }
    }
}
