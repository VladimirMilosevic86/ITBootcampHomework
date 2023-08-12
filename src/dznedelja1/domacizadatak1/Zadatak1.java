package dznedelja1.domacizadatak1;

public class Zadatak1 {

    public static void main(String[] args) {

        String ime = "Vladimir";
        String prezime = "Milosevic";
        int godinaRodjenja = 1986;
        int godinaZaposlenja = 2005;

        System.out.println("Ime i prezime: " + ime + " " + prezime);
        System.out.println("Godina rodjenja: " + godinaRodjenja);
        System.out.println("Godina zaposlenja: " + godinaZaposlenja);
        System.out.println("Godine radnog staza: " + (2023 - godinaZaposlenja));
    }
}
