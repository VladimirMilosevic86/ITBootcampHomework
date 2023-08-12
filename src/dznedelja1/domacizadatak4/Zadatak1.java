package dznedelja1.domacizadatak4;

import java.util.Scanner;

public class Zadatak1 {

    /*Domaci Zadatak 1:
    Uneti neki ceo broj N preko Scannera. Proci kroz svaki broj od 0 do N i za svaki broj koji je
    deljiv sa 3 istampati “Fizz”, za svaki broj koji je deljiv sa 5 ispisujemo “Buzz”, a u slucaju da
    je broj deljiv i sa 5 i sa 3, ispisujemo “FizzBuzz” (Obratiti paznju da broj bude pozitivan).*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesi ceo broj: ");
        int broj = sc.nextInt();

        if (broj < 0)
            System.out.println("Morate uneti pozitivan broj!");
        else {
            for (int i = 0;  i <= broj; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + ": FizzBuzz");
                }
                else if (i % 3 == 0) {
                    System.out.println(i + ": Fizz");
                }
                else if (i % 5 == 0) {
                    System.out.println(i + ": Buzz");
                }
                else
                    System.out.println(i);
            }
        }

    }

}
