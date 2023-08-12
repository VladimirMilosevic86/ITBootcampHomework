package dznedelja2.domacizadatak5;

import java.util.Scanner;

public class Zadatak2 {

    //Definisati dva jednaka niza brojeva, kao rezultat vratiti niz gde ce se sabrati svi elementi sa istim indeksima.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] niz1 = {1, 2, 3};
        int[] niz2 = {2, 4, 5};

        int[] nizRezultat = new int[niz1.length];

        System.out.print("Niz 1: "); //ispisuje pre elemenata niza naziv u istom redu sa elementima
        //Ispusuje elemente niza 1 u istom redu
        for (int i : niz1) {
            System.out.print(i + " "); //ispisuje brojeve u istom redu sa razmakom
        }
        System.out.println(); //prelazi u novi red

        System.out.print("Niz 2: ");
        //Ispusuje elemente niza 2 u istom redu
        for (int i : niz2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.print("Niz 3: ");
        //ispisuje rezultat (novi niz) u istom redu
        for (int i = 0; i < nizRezultat.length; i++) {
            nizRezultat[i] = niz1[i] + niz2[i];
            System.out.print(nizRezultat[i] + " ");
        }
        System.out.println();
    }

}
