package dznedelja1.domacizadatak1;

public class Zadatak2 {

    public static void main(String[] args) {

        int x = 6;
        int y = 2;

        System.out.println("Sabiranje: " + (x + y));
        System.out.println("Oduzimanje: " + (x - y));
        System.out.println("Mnozenje: " + x * y);
        System.out.println("Deljenje: " + x / y);
        System.out.println("X na kvadrat je: " + x * x);

       /* Opcija 2 za X na kvadrat (sa pozivanjem klase Math)
       System.out.println("X na kvadrat je: " + Math.pow(x, 2));
       */
    }
}
